package mainPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cars.Corolla;
import cars.Swift;
import interfaces.*;

public class App {

	public static void main(String[] args) {
		
//		Car swift = new Swift();
//		Car corolla = new Corolla();
//		
//		System.out.println(  swift.specs()  );
//		
//		System.out.println(  corolla.specs()  );
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("swift",Car.class);
		
		System.out.println(   myCar.specs());
		context.close();

	}

}
