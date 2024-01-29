package com.springbootapiaws.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    public static final String ACCESS_KEY = "";
    public static final String SECRET_KEY = "";
    public static final String RESGION_NAME = "us-east-2";
    public static final String REGION_ENDPOINT = "dynamodb.us-east-2.amazonaws.com";

    @Bean
    public DynamoDBMapper mapper() {
        return new DynamoDBMapper(amazonDynamoDBDBConfig());
    }

    private AmazonDynamoDB amazonDynamoDBDBConfig() {

        return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(REGION_ENDPOINT, RESGION_NAME)
                ).withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY))
                ).build();
    }
}
