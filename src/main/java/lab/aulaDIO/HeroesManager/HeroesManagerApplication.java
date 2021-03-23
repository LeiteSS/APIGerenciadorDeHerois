package lab.aulaDIO.HeroesManager;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroesManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesManagerApplication.class, args);
		System.out.println("Super Powers With Webflux");
	}

}
