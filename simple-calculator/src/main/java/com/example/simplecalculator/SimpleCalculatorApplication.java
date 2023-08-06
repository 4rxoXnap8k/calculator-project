package com.example.simplecalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@SpringBootApplication
@RestController
public class SimpleCalculatorApplication {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);
    }

    @GetMapping()
    public String getApplicationName() {
        return env.getProperty("spring.application.name");
    }

}
