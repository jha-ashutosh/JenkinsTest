package com.packfile;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class JenkinsTestApplicationTests {
    public static Logger logger= LoggerFactory.getLogger(JenkinsTestApplicationTests.class);
    @Test
    public void contextLoad(){
        logger.info("inside test case");
        assertEquals(true,true);
    }
}
