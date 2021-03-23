package lab.aulaDIO.HeroesManager.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;

import static lab.aulaDIO.HeroesManager.constans.HeroesConstant.ENDPOINT_DYNAMO;
import static lab.aulaDIO.HeroesManager.constans.HeroesConstant.REGION_DYNAMO;

public class HeroesData {
    public static void main(String[] args) throws Exception {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
                .build();
        DynamoDB dynamoDB = new DynamoDB(client);
        Table table = dynamoDB.getTable("Heroes_Table");
        Item hero1 = new Item().withPrimaryKey("id", 1)
                .withString("name", "The Amazing Spider Man")
                .withString("universe", "Marvel Comics")
                .withNumber("films", 9);

        Item hero2 = new Item().withPrimaryKey("id", 1)
                .withString("name", "Batman The Dark Knight")
                .withString("universe", "DC Comics")
                .withNumber("films", 7);

        Item hero3 = new Item().withPrimaryKey("id", 1)
                .withString("name", "Constantine")
                .withString("universe", "DC Comics")
                .withNumber("films", 1);

        PutItemOutcome outcome1= table.putItem(hero1);
        PutItemOutcome outcome2= table.putItem(hero2);
        PutItemOutcome outcome3= table.putItem(hero3);

    }
}
