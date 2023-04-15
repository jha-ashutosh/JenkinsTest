package com.packfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    public static Logger logger= LoggerFactory.getLogger(HelloWorld.class);
    @GetMapping("/hello")
    public String hello(){
    logger.info("inside hello method");
        return "Hello Ashutosh";
    }

}
