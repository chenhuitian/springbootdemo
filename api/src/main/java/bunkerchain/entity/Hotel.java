package bunkerchain.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//one to many
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
	
		@Column(length = 32)
	    private String name;
	    @Column(length = 32)
	    private String number;
	    
	    @OneToMany(mappedBy = "hotel")
	    private Set<Customer> cutomers = new HashSet<>();
	    
	 
		public Set<Customer> getCutomers() {
			return cutomers;
		}

		public void setCutomers(Set<Customer> cutomers) {
			this.cutomers = cutomers;
		}

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