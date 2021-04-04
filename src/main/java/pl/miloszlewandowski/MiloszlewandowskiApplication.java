package pl.miloszlewandowski;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MiloszlewandowskiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiloszlewandowskiApplication.class, args);
	}

	//Tutorial accesingDataJPA
}
