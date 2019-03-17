package SpringbootApplication.Car;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@RequestMapping (value="/hello")
	public List<Car> getAllCars () {
			
			return Arrays.asList(
					
					new Car  (" Aston Martin ","2015 Aston Martin DB9 Carbon Edition"),
					new Car  ("2015 BMW I8","2015 BMW I8"),
					new Car  ("Chevrolet","2015 Chevrolet Sonic"),
					new Car  ("Chevrolet","2015 Chevrolet Silverado 2500HD"),
					new Car  ("Ford","2016 Ford Fusion")
				); 	
	}
}
 