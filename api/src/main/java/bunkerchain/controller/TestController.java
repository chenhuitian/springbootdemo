package bunkerchain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class TestController {

	@RequestMapping(method = RequestMethod.GET)
	public String Hello() {
		return "hello world";
	}
	
	@RequestMapping(value = "/showError", method = RequestMethod.GET)
	public String showError() {
		int i=9/0;
		return "dd";
	}
}
