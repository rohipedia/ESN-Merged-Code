package com.emt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
@EnableJpaAuditing
public class EsnManagementApplication {
	@SuppressWarnings("unchecked")
	@Bean
	public Jackson2ObjectMapperBuilder configureObjectMapper() {
	    return new Jackson2ObjectMapperBuilder().modulesToInstall(Hibernate5Module.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EsnManagementApplication.class, args);
	}
}

