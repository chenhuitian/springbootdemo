package bunkerchain.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "mfm_system_seal_checklist")
public class MFMSystemSealChecklist implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
//	@OneToOne(mappedBy = "mfmSystemSealChecklist", cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER)
//	private BunkerDeliveryNote bunkerDeliveryNote;
	
	private int sealVerificationReportNumber;
	
	private java.sql.Timestamp cargoOfficerConfirmedAtBeforeDelivery;
	private java.sql.Timestamp chiefEngineerConfirmedAtBeforeDelivery;
	private java.sql.Timestamp surveyorConfirmedAtBeforeDelivery;
	
	private java.sql.Timestamp cargoOfficerSignedAtBeforeDelivery;
	private java.sql.Timestamp chiefEngineerSignedAtBeforeDelivery;
	private java.sql.Timestamp surveyorSignedAtBeforeDelivery;
	
	private java.sql.Timestamp cargoOfficerConfirmedAtAfterDelivery;
	private java.sql.Timestamp chiefEngineerConfirmedAtAfterDelivery;
	private java.sql.Timestamp surveyorConfirmedAtAfterDelivery;
	
	private java.sql.Timestamp cargoOfficerSignedAtAfterDelivery;
	private java.sql.Timestamp chiefEngineerSignedAtAfterDelivery;
	private java.sql.Timestamp surveyorSignedAtAfterDelivery;
	
	@OneToMany(mappedBy = "mfmSystemSealChecklist")
	private Set<MFMSystemSealChecklistItem> checkListAssoc = new HashSet<>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public java.sql.Timestamp getCargoOfficerConfirmedAtBeforeDelivery() {
		return cargoOfficerConfirmedAtBeforeDelivery;
	}
	public void setCargoOfficerConfirmedAtBeforeDelivery(java.sql.Timestamp cargoOfficerConfirmedAtBeforeDelivery) {
		this.cargoOfficerConfirmedAtBeforeDelivery = cargoOfficerConfirmedAtBeforeDelivery;
	}
	public java.sql.Timestamp getChiefEngineerConfirmedAtBeforeDelivery() {
		return chiefEngineerConfirmedAtBeforeDelivery;
	}
	public void setChiefEngineerConfirmedAtBeforeDelivery(java.sql.Timestamp chiefEngineerConfirmedAtBeforeDelivery) {
		this.chiefEngineerConfirmedAtBeforeDelivery = chiefEngineerConfirmedAtBeforeDelivery;
	}
	public java.sql.Timestamp getSurveyorConfirmedAtBeforeDelivery() {
		return surveyorConfirmedAtBeforeDelivery;
	}
	public void setSurveyorConfirmedAtBeforeDelivery(java.sql.Timestamp surveyorConfirmedAtBeforeDelivery) {
		this.surveyorConfirmedAtBeforeDelivery = surveyorConfirmedAtBeforeDelivery;
	}
	public java.sql.Timestamp getCargoOfficerSignedAtBeforeDelivery() {
		return cargoOfficerSignedAtBeforeDelivery;
	}
	public void setCargoOfficerSignedAtBeforeDelivery(java.sql.Timestamp cargoOfficerSignedAtBeforeDelivery) {
		this.cargoOfficerSignedAtBeforeDelivery = cargoOfficerSignedAtBeforeDelivery;
	}
	public java.sql.Timestamp getChiefEngineerSignedAtBeforeDelivery() {
		return chiefEngineerSignedAtBeforeDelivery;
	}
	public void setChiefEngineerSignedAtBeforeDelivery(java.sql.Timestamp chiefEngineerSignedAtBeforeDelivery) {
		this.chiefEngineerSignedAtBeforeDelivery = chiefEngineerSignedAtBeforeDelivery;
	}
	public java.sql.Timestamp getSurveyorSignedAtBeforeDelivery() {
		return surveyorSignedAtBeforeDelivery;
	}
	public void setSurveyorSignedAtBeforeDelivery(java.sql.Timestamp surveyorSignedAtBeforeDelivery) {
		this.surveyorSignedAtBeforeDelivery = surveyorSignedAtBeforeDelivery;
	}
	public java.sql.Timestamp getCargoOfficerConfirmedAtAfterDelivery() {
		return cargoOfficerConfirmedAtAfterDelivery;
	}
	public void setCargoOfficerConfirmedAtAfterDelivery(java.sql.Timestamp cargoOfficerConfirmedAtAfterDelivery) {
		this.cargoOfficerConfirmedAtAfterDelivery = cargoOfficerConfirmedAtAfterDelivery;
	}
	public java.sql.Timestamp getChiefEngineerConfirmedAtAfterDelivery() {
		return chiefEngineerConfirmedAtAfterDelivery;
	}
	public void setChiefEngineerConfirmedAtAfterDelivery(java.sql.Timestamp chiefEngineerConfirmedAtAfterDelivery) {
		this.chiefEngineerConfirmedAtAfterDelivery = chiefEngineerConfirmedAtAfterDelivery;
	}
	public java.sql.Timestamp getSurveyorConfirmedAtAfterDelivery() {
		return surveyorConfirmedAtAfterDelivery;
	}
	public void setSurveyorConfirmedAtAfterDelivery(java.sql.Timestamp surveyorConfirmedAtAfterDelivery) {
		this.surveyorConfirmedAtAfterDelivery = surveyorConfirmedAtAfterDelivery;
	}
	public java.sql.Timestamp getCargoOfficerSignedAtAfterDelivery() {
		return cargoOfficerSignedAtAfterDelivery;
	}
	public void setCargoOfficerSignedAtAfterDelivery(java.sql.Timestamp cargoOfficerSignedAtAfterDelivery) {
		this.cargoOfficerSignedAtAfterDelivery = cargoOfficerSignedAtAfterDelivery;
	}
	public java.sql.Timestamp getChiefEngineerSignedAtAfterDelivery() {
		return chiefEngineerSignedAtAfterDelivery;
	}
	public void setChiefEngineerSignedAtAfterDelivery(java.sql.Timestamp chiefEngineerSignedAtAfterDelivery) {
		this.chiefEngineerSignedAtAfterDelivery = chiefEngineerSignedAtAfterDelivery;
	}
	public java.sql.Timestamp getSurveyorSignedAtAfterDelivery() {
		return surveyorSignedAtAfterDelivery;
	}
	public void setSurveyorSignedAtAfterDelivery(java.sql.Timestamp surveyorSignedAtAfterDelivery) {
		this.surveyorSignedAtAfterDelivery = surveyorSignedAtAfterDelivery;
	}
	
	public MFMSystemSealChecklist() {
		// TODO Auto-generated constructor stub
	}

}
