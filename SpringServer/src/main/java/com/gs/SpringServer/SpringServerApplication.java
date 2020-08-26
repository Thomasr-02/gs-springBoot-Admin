package com.gs.SpringServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringServerApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringServerApplication.class, args);
    }


}