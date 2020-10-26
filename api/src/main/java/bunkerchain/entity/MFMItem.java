package bunkerchain.entity;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mfm_item")
public class MFMItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_tag")
	private String itemTag;
	
	@Column(name = "item_category")
	private int itemCategory;
	
	@OneToMany(mappedBy = "mfmItem")
	private Set<MFMSystemSealChecklistItem> itemAssoc = new HashSet<>();
	
	
}
