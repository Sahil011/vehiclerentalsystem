package com.example.vehiclerental;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class VehiclerentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehiclerentalApplication.class, args);
    }

}
