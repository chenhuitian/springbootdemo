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
@Table(name = "predelivery_safety_item")
public class PredeliverySafetyItem implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String itemDescription;
	private String remarkFormat;
	
	private int orderIndex;
	private int grade;
	
	private float initialRate;
	private float maxRate;
	private float toppingRate;
	
	@OneToMany(mappedBy = "predeliverySafetyItem")
	private Set<PredeliverySafetyChecklistItem> itemAssoc = new HashSet<>();

}
