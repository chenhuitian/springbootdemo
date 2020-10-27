package bunkerchain.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "bunker_delivery_note")
public class BunkerDeliveryNote implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int status;
	private String bdnNumber;
	private int vesselGrt;
	private String nextPort;
	
	private String remark;
	
	private java.sql.Timestamp alongsideAt;
	private java.sql.Timestamp etdAt;
	
	private java.sql.Timestamp cargoOfficerConfirmedAt;
	private java.sql.Timestamp chiefEngineerConfirmedAt;
	private java.sql.Timestamp surveyorConfirmedAt;
	
	private java.sql.Timestamp cargoOfficerSignedAt;
	private java.sql.Timestamp chiefEngineerSignedAt;
	private java.sql.Timestamp surveyorSignedAt;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private Job job;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bunker_requisition_form_id")
    private BunkerRequisitionForm bunkerRequisitionForm;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mfm_system_seal_checklist_id")
    private MFMSystemSealChecklist mfmSystemSealChecklist;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meter_reading_record_form_id")
    private MeterReadingRecordForm meterReadingRecordForm;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "predelivery_safety_checklist_id")
    private PredeliverySafetyChecklist predeliverySafetyChecklist;

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public java.sql.Timestamp getAlongsideAt() {
		return alongsideAt;
	}

	public void setAlongsideAt(java.sql.Timestamp alongsideAt) {
		this.alongsideAt = alongsideAt;
	}
	
	

	public java.sql.Timestamp getCargoOfficerConfirmedAt() {
		return cargoOfficerConfirmedAt;
	}

	public void setCargoOfficerConfirmedAt(java.sql.Timestamp cargoOfficerConfirmedAt) {
		this.cargoOfficerConfirmedAt = cargoOfficerConfirmedAt;
	}

	public java.sql.Timestamp getChiefEngineerConfirmedAt() {
		return chiefEngineerConfirmedAt;
	}

	public void setChiefEngineerConfirmedAt(java.sql.Timestamp chiefEngineerConfirmedAt) {
		this.chiefEngineerConfirmedAt = chiefEngineerConfirmedAt;
	}

	public java.sql.Timestamp getSurveyorConfirmedAt() {
		return surveyorConfirmedAt;
	}

	public void setSurveyorConfirmedAt(java.sql.Timestamp surveyorConfirmedAt) {
		this.surveyorConfirmedAt = surveyorConfirmedAt;
	}

	public java.sql.Timestamp getCargoOfficerSignedAt() {
		return cargoOfficerSignedAt;
	}

	public void setCargoOfficerSignedAt(java.sql.Timestamp cargoOfficerSignedAt) {
		this.cargoOfficerSignedAt = cargoOfficerSignedAt;
	}

	public java.sql.Timestamp getChiefEngineerSignedAt() {
		return chiefEngineerSignedAt;
	}

	public void setChiefEngineerSignedAt(java.sql.Timestamp chiefEngineerSignedAt) {
		this.chiefEngineerSignedAt = chiefEngineerSignedAt;
	}

	public java.sql.Timestamp getSurveyorSignedAt() {
		return surveyorSignedAt;
	}

	public void setSurveyorSignedAt(java.sql.Timestamp surveyorSignedAt) {
		this.surveyorSignedAt = surveyorSignedAt;
	}

	public BunkerDeliveryNote(Job job) {
		this.job = job;
		this.status = 1;
		
		//create sub forms
		BunkerRequisitionForm brf = new BunkerRequisitionForm();
		this.bunkerRequisitionForm = brf;
		
		PredeliverySafetyChecklist psc = new PredeliverySafetyChecklist();
		this.predeliverySafetyChecklist = psc;
		
		MeterReadingRecordForm mrrf = new MeterReadingRecordForm();
		this.meterReadingRecordForm = mrrf;
		
		MFMSystemSealChecklist mssc = new MFMSystemSealChecklist();
		this.mfmSystemSealChecklist = mssc;
		
	}
	
	public BunkerDeliveryNote() {
	}
	
	public boolean isConfirmed() {
		java.sql.Timestamp cargoOfficerConfirmedAt = this.cargoOfficerConfirmedAt;
		java.sql.Timestamp chiefEngineerConfirmedAt = this.chiefEngineerConfirmedAt;
		java.sql.Timestamp surveyorConfirmedAt = this.surveyorConfirmedAt;
		
		if(cargoOfficerConfirmedAt != null && chiefEngineerConfirmedAt != null && surveyorConfirmedAt != null) {
			return true;
		}
		return false;
	}
	
	public boolean isSigned() {
		java.sql.Timestamp cargoOfficerSigned = this.cargoOfficerSignedAt;
		java.sql.Timestamp chiefEngineerSignedAt = this.chiefEngineerSignedAt;
		java.sql.Timestamp surveyorSignedAt = this.surveyorSignedAt;
		
		if(cargoOfficerSigned != null && chiefEngineerSignedAt != null && surveyorSignedAt != null) {
			return true;
		}
		return false;
	}
	
	
	

}
