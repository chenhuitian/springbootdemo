package bunkerchain.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bunkerchain.entity.Customer;
import bunkerchain.entity.Job;
import bunkerchain.entity.Location;
import bunkerchain.repository.JobDao;

@RestController
@RequestMapping("/jobs")
@Resource
public class JobController {
	
	@Autowired
	JobDao jobDao;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Job> getJob(@PathVariable("id") Long id){
		return jobDao.findById(id);
	}
	
	@RequestMapping()
	public List<Job> getAll() {
		return jobDao.findAll();
	}
	
	@RequestMapping(value="/{id}/accept", method=RequestMethod.PUT)
	public Job acceptJob(@PathVariable("id") Long id) throws Exception {
		Job j = jobDao.getOne(id);
		if(j.getStatus() != 1) {
			throw new Exception("Job status is not pending.");
		}
		
		j.setStatus(2);

	  return jobDao.save(j);
	}
	
	

}
