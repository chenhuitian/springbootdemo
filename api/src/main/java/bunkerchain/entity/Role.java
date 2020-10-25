package bunkerchain.entity;

import java.awt.Menu;
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
import javax.persistence.Table;

//many to many
@Entity
@Table(name = "role")
public class Role {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String roleName;
	
	
//	@ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                CascadeType.PERSIST,
//                CascadeType.MERGE
//            })
//    @JoinTable(name = "role_menus",
//            joinColumns = { @JoinColumn(name = "role_id") },
//            inverseJoinColumns = { @JoinColumn(name = "menu_id") })
//    private Set<Menu> menus = new HashSet<>();
//
//	public Set<Menu> getMenus() {
//		return menus;
//	}
//
//	public void setMenus(Set<Menu> menus) {
//		this.menus = menus;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	

}
