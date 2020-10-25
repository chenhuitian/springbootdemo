package bunkerchain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// one to one

@Entity
@Table(name = "Card")
public class Card {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	    @GeneratedValue
	    private Long id;
//		public Card(String customerCode) {
//		super();
//		this.customerCode = customerCode;
//	}
		
//		   public Card(String name, String number) {
//				super();
//				this.name = name;
//				this.number = number;
//			}

				@Column(length = 32)
			    private String name;

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


//			    @Column(length = 32)
//			    private String number;
//			    public String getNumber() {
//			        return number;
//			    }
//
//			    public void setNumber(String number) {
//			        this.number = number;
//			    }
//		@Column(length = 32)
//		private String customerCode;
//		public String getCustomerCode() {
//			return customerCode;
//		}
//		public void setCustomerCode(String customerCode) {
//			this.customerCode = customerCode;
//		}
	  
}
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Card")
//public class Card {
//	private static final long serialVersionUID = 1L;
//	@Id
//	@GeneratedValue
//	private Long id;
//
//	@Column(length = 32)
//	private String code;
//
//	public Card(String code) {
//		super();
//		this.code = code;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getCode() {
//		return code;
//	}
//
//	public void setCode(String code) {
//		this.code = code;
//	}
//}
