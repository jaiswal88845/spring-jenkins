package com.jlj.springjenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	  final Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	  
	  @PostConstruct
	  public void init() {
		  logger.info("HELLO Mr. JLJ !!!!!!!!!!!!!!!!!!!!!!!!!!");
	  }


	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
