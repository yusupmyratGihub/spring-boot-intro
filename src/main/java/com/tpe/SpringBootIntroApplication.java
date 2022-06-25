package com.tpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroApplication.class, args);
    }

}
