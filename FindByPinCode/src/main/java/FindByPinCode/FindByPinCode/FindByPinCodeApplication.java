package FindByPinCode.FindByPinCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FindByPinCodeApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(FindByPinCodeApplication.class, args);
		
	}
	@Bean
	public RestTemplate RestTemplate() {
		
		return new RestTemplate();
	}

}
