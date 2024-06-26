package com.frun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FrunApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrunApplication.class, args);
    }
}
