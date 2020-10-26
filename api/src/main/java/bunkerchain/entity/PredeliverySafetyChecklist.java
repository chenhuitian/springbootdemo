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
import javax.persistence.Table;

@Entity
@Table(name = "predelivery_safety_checklist")
public class PredeliverySafetyChecklist implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private java.sql.Timestamp cargoOfficerConfirmedAt;
	private java.sql.Timestamp chiefEngineerConfirmedAt;
	private java.sql.Timestamp surveyorConfirmedAt;
	
	private java.sql.Timestamp cargoOfficerSignedAt;
	private java.sql.Timestamp chiefEngineerSignedAt;
	private java.sql.Timestamp surveyorSignedAt;
	
	@OneToMany(mappedBy = "predeliverySafetyChecklist")
	private Set<PredeliverySafetyChecklistItem> checkListAssoc = new HashSet<>();

}
