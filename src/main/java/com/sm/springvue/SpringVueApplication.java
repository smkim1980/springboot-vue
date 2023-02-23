package com.sm.springvue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class SpringVueApplication {

    Logger logger = LoggerFactory.getLogger(SpringVueApplication.class);

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringVueApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }

}
