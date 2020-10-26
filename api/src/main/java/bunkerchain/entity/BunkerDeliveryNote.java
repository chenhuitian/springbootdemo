package bunkerchain.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bunker_requisition_form_id", referencedColumnName = "id")
    private BunkerRequisitionForm bunkerRequisitionForm;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mfm_system_seal_checklist_id", referencedColumnName = "id")
    private MFMSystemSealChecklist mfmSystemSealChecklist;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meter_reading_record_form_id", referencedColumnName = "id")
    private MeterReadingRecordForm meterReadingRecordForm;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "predelivery_safety_checklist_id", referencedColumnName = "id")
    private PredeliverySafetyChecklist predeliverySafetyChecklist;
	

}
