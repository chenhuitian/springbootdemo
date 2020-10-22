package bukerchain.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan("bunkerchain")
public class SpringApplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringApplications.class,args);
	}

}
