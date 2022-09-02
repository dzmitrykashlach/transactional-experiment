package com.dzmitrykashlach.aoptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TransactionalExperimentApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TransactionalExperimentApplication.class, args);
	    ServiceDzkImpl serviceDzk = applicationContext.getBean(ServiceDzkImpl.class);
		serviceDzk.method2();
	}

}
