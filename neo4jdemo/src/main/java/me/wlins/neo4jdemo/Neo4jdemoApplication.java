package me.wlins.neo4jdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Neo4jdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jdemoApplication.class, args);
	}
}
