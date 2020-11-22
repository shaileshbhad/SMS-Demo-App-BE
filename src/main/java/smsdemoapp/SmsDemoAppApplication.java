package smsdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("smsdemoapp.repo")
@EntityScan("smsdemoapp.entity")
public class SmsDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsDemoAppApplication.class, args);
	}

}
