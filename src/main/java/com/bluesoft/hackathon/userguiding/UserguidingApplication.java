package com.bluesoft.hackathon.userguiding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Collections;

@SpringBootApplication
public class UserguidingApplication {

    public static void main(String[] args) {
        try {

            SpringApplication applicationContext = new SpringApplication(UserguidingApplication.class);
            applicationContext.setDefaultProperties(Collections.singletonMap("server.port", "8484"));
            applicationContext.run(args);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
