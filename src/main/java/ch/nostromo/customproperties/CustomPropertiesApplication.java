package ch.nostromo.customproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
@EnableCaching
public class CustomPropertiesApplication  {
	public static void main(String[] args) {
		SpringApplication.run(CustomPropertiesApplication.class, args);
	}
}
