package io.github.leitess.HeroesManager;

//import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

//@EnableDynamoDBRepositories
@SpringBootApplication
@EnableMongoAuditing
@EnableReactiveMongoRepositories
public class HeroesManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesManagerApplication.class, args);
		System.out.println("Super Powers With Webflux");
	}

}
