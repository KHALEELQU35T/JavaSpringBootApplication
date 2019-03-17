package SpringbootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class SpringbootApplicationController {

	
	@RestController
	public static class CarController {
		
		@RequestMapping (value="/")
		public static String Car () {
				
				return "Welcome To My Spring Boot Application Please Enter /Hello To See Car Name And Manufacturer";
		}
	}

}
