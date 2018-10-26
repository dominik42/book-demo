package de.todo42.workshop.bookdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "myApp")
@Data
public class AppConfig {
	
	private String email;
	private int threadPool;

}
