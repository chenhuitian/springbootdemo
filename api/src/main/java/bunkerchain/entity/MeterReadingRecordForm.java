package bunkerchain.entity;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "meter_reading_record_form")
public class MeterReadingRecordForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "sampling_container_seal_number")
	private int samplingContainerSealNumber;
	
	@Column(name = "needle_valve_seal_number")
	private int needleValveSealNumber;
	
	@Column(name = "vessel_has_sufficient_tank_space_for_purging")
	private boolean vesselHasSufficientTankSpaceForPurging;
	
	@Column(name = "remark", columnDefinition="TEXT")
	private String remark;
	
	@Column(name = "meter_serial_number")
	private int meterSerialNumber;
	
	@Column(name = "bunker_meter_ticket_number")
	private int bunkerMeterTicketNumber;
	
	@Column(name = "mt_a")
	private float mtA;
	
	@Column(name = "mt_b")
	private float mtB;
	
	@Column(name = "mt_x")
	private float mtX;
	
	@Column(name = "mt_y")
	private float mtY;
	
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

}
