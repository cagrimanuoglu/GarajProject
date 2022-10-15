package com.example.GarageApi;

import com.example.GarageApi.entity.Garage;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class GarageApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageApiApplication.class, args);
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Garage garage(){
		return new Garage();
	}

}
