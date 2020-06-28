package cars;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Autowired
	Engine engine;
	
	public String specs() {
		
		

		return "sadan from toyota";
	}
}
