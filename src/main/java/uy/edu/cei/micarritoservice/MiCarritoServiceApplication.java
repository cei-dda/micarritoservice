package uy.edu.cei.micarritoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiCarritoServiceApplication {

	public MiCarritoServiceApplication(
			@Qualifier("diesel") Motor motor,
			@Qualifier("nafta") Motor nafta,
			MotorMonitor motorMonitor
	) {
		System.out.println("esta prendido " + motorMonitor.estaPrendido());
		motor.prender();
		System.out.println("esta prendido " + motorMonitor.estaPrendido());
		System.out.println("nafta " + nafta.estaPrendido());
	}

	public static void main(String[] args) {
		SpringApplication.run(MiCarritoServiceApplication.class, args);
	}

}
