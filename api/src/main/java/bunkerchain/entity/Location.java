package bunkerchain.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "location")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Location() {}
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String locationCode;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String location_code) {
		this.locationCode = location_code;
	}

	public Location(String location_code) {
		this.locationCode = location_code;
	}

	

}
