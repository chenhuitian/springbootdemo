package bunkerchain.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargos")
public class CargoController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getCargoName(@PathVariable("id") long id) {
		return "cargo id: " + id ;
	}
}
