package com.example.eventscheduler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication()
@EnableScheduling
@EnableAutoConfiguration
@MapperScan("com.example.eventscheduler")
public class EventSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventSchedulerApplication.class, args);
	}

}
