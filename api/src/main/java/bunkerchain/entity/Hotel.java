package bunkerchain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	    @GeneratedValue
	    private Long id;
	
	    public Hotel(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

		@Column(length = 32)
	    private String name;
	    @Column(length = 32)
	    private String number;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getNumber() {
	        return number;
	    }

	    public void setNumber(String number) {
	        this.number = number;
	    }

	   
}