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
@Table(name = "predelivery_safety_checklist_item")
public class PredeliverySafetyChecklistItem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "checklist_id", referencedColumnName = "id")
	private PredeliverySafetyChecklist predeliverySafetyChecklist;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private PredeliverySafetyItem predeliverySafetyItem;
	
	private boolean bunkerTankerChecked;
	private boolean vesselChecked;
	
	@Column(columnDefinition="TEXT")
	private String remark;
	
	

}
