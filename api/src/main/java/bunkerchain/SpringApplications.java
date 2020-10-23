package bunkerchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
//@ComponentScan("bunkerchain")
@SpringBootApplication(scanBasePackages={
"bunkerchain.controller", "bunkerchain.entity","bunkerchain.repository","bunkerchain.intercepter"})
public class SpringApplications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringApplications.class,args);
	}

}
