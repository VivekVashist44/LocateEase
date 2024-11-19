package FindByPinCode.FindByPinCode;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfigure {

	 public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/api/**")
	                        .allowedOrigins("http://localhost:8080") // Change to your frontend origin
	                        .allowedMethods("GET", "POST", "PUT", "DELETE");
	            }
	        };
	    }
}
