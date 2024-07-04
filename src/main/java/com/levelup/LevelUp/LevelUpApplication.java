package com.levelup.LevelUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
@EntityScan("com.levelup.Model")
@EnableJpaRepositories("com.levelup.Jpa")
public class LevelUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(LevelUpApplication.class, args);
		System.out.println("App Started");
	}

}
