package com.ep.sping.boot.web.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ep")
public class SpringbootwebApplication {

    public static void main(String[] args) {
    	System.out.println("---------Started-------------");
        SpringApplication.run(SpringbootwebApplication.class, args);
    }

}
