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
@Table(name = "mfm_checklist_item")
public class MFMSystemSealChecklistItem implements Serializable {
	
	@Id
    @ManyToOne
    @JoinColumn(name = "checklist_id", referencedColumnName = "id")
	private MFMSystemSealChecklist mfmSystemSealChecklist;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "item_id", referencedColumnName = "id")
	private MFMItem mfmItem;
	
	@Column(name = "seal_number")
	private int sealNumber;
	
	@Column(name = "before_delivery_intact")
	private boolean beforeDeliveryIntact;
	
	@Column(name = "after_delivery_intact")
	private boolean afterDeliveryIntact;
	
	@Column(name = "remark", columnDefinition="TEXT")
	private String remark;

	
	
}
