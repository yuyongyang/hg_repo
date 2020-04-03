package com.hg.systemGd.issm;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IssmApplication {

    private static Logger logger = Logger.getLogger(IssmApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(IssmApplication.class, args);
    }

}
