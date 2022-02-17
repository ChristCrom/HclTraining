package com.chris.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chris.auto.Vehicle;
import com.chris.autoimpl.Mazaratti;

@Configuration
@ComponentScan("com.chris")
public class VehicleConfig {
	
	@Bean(name="maz")
    public Vehicle getMazaratti() {
    	
    	return new Mazaratti();
    	
    }
}
