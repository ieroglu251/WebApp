package mainPackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("mainPackage")
@ComponentScan("interfaces")
@ComponentScan("cars")
public class AppConfig {

}
