package com.packfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTestApplication {
    public static Logger logger= LoggerFactory.getLogger(JenkinsTestApplication.class);

    @PostConstruct
    public void init(){
        logger.info("main method executed");
    }
    public static void main(String[] args) {
        logger.info("main method executed");
        SpringApplication.run(JenkinsTestApplication.class,args);
    }
}
