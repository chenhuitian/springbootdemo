package bunkerchain.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bunkerchain.entity.BunkerDeliveryNote;
import bunkerchain.entity.Job;
import bunkerchain.repository.BunkerDeliveryNoteDao;
import bunkerchain.repository.JobDao;;

@RestController
@RequestMapping("/bdns")
@Resource
public class BunkerDeliveryNoteController {
	
	@Autowired
	JobDao jobDao;
	
	@Autowired
	BunkerDeliveryNoteDao bunkerDeliveryNoteDao;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional <BunkerDeliveryNote> getBunkerDeliveryNote(@PathVariable("id") Long id){
		return bunkerDeliveryNoteDao.findById(id);
	}
	
	@RequestMapping()
	public List<BunkerDeliveryNote> getAll() {
		return bunkerDeliveryNoteDao.findAll();
	}
	
	@PostMapping()
	public BunkerDeliveryNote newBunkerDeliveryNote(@RequestParam Long jobid) throws Exception {
		Job job = jobDao.getOne(jobid);
		if(job.getStatus() != 2) {
			throw new Exception("Job status is not confirmed.");
		}
		
		BunkerDeliveryNote bunkerDeliveryNote = new BunkerDeliveryNote(job);
		
		job.setStatus(3);
		jobDao.save(job);
		
		return bunkerDeliveryNoteDao.save(bunkerDeliveryNote);
	}
	
	@RequestMapping(value = "/{id}/begin_transaction", method = RequestMethod.PUT)
	public BunkerDeliveryNote beginTransaction(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		if(b.getStatus() != 1) {
			throw new Exception("BDN status is not pending.");
		}
		
		long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
		
        b.setAlongsideAt(sqlTimestamp);
		b.setStatus(2); 

	  return bunkerDeliveryNoteDao.save(b);
	}
	
	@RequestMapping(value = "/{id}/reject", method = RequestMethod.PUT)
	public BunkerDeliveryNote reject(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		boolean isConfirmed = b.isConfirmed();
		
		if(isConfirmed) {
			throw new Exception("BDN is already confirmed by all.");
		}
		
		b.setCargoOfficerConfirmedAt(null);
		b.setChiefEngineerConfirmedAt(null);
		b.setSurveyorConfirmedAt(null);
		
        //log this action
        return bunkerDeliveryNoteDao.save(b);
	}
	
	
	
	@RequestMapping(value = "/{id}/cargo_officer_confirm", method = RequestMethod.PUT)
	public BunkerDeliveryNote cargoOfficerConfirm(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		if(b.getStatus() != 2) {
			throw new Exception("BDN status is not alongside.");
		}
		
		long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
		
        b.setCargoOfficerConfirmedAt(sqlTimestamp);
	  return bunkerDeliveryNoteDao.save(b);
	}
	
	@RequestMapping(value = "/{id}/chief_engineer_confirm", method = RequestMethod.PUT)
	public BunkerDeliveryNote chiefEngineerConfirm(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		if(b.getStatus() != 2) {
			throw new Exception("BDN status is not alongside.");
		}
		
		long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
		
        b.setChiefEngineerConfirmedAt(sqlTimestamp);
	  return bunkerDeliveryNoteDao.save(b);
	}
	
	@RequestMapping(value = "/{id}/surveyor_confirm", method = RequestMethod.PUT)
	public BunkerDeliveryNote surveyorConfirm(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		if(b.getStatus() != 2) {
			throw new Exception("BDN status is not alongside.");
		}
		
		long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
		
        b.setSurveyorConfirmedAt(sqlTimestamp);
	  return bunkerDeliveryNoteDao.save(b);
	}
	
	@RequestMapping(value = "/{id}/cargo_officer_sign", method = RequestMethod.PUT)
	public BunkerDeliveryNote cargoOfficerSign(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		
		boolean isConfirmed = b.isConfirmed();
		
		if(!isConfirmed) {
			throw new Exception("BDN is not confirmed by all.");
		}
		
		long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
		
        b.setCargoOfficerSignedAt(sqlTimestamp);
	  return bunkerDeliveryNoteDao.save(b);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) throws Exception {
		BunkerDeliveryNote b = bunkerDeliveryNoteDao.getOne(id);
		
		if(b.getStatus() != 1) {
			throw new Exception("BDN is not pending.");
		}
		bunkerDeliveryNoteDao.delete(b);
	  return "success";
	}


}
