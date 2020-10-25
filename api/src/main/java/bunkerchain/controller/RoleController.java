package bunkerchain.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bunkerchain.entity.Role;
import bunkerchain.repository.MenuDao;
import bunkerchain.repository.RoleDao;

@RestController
@RequestMapping("/roles")
@Resource
public class RoleController {
	@Autowired
	RoleDao roleDao;
	@Autowired
	MenuDao menuDao;
	
	@PostMapping("")
	public Role newCustomer(@RequestBody Role role) {
		return roleDao.save(role);
	}

}
