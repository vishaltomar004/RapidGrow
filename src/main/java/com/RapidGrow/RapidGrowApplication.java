package com.RapidGrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RapidGrowApplication {
  public static void main(String[] args) {
    SpringApplication.run(RapidGrowApplication.class, args);
  }
}
