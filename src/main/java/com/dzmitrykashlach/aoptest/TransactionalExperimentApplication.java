package com.dzmitrykashlach.aoptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransactionalExperimentApplication {

    @Autowired
    ServiceDzkImpl serviceDzk;

    public static void main(String[] args) {
        SpringApplication.run(TransactionalExperimentApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            serviceDzk.method1();
        };
    }
}
