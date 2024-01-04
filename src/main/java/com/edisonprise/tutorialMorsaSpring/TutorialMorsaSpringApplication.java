package com.edisonprise.tutorialMorsaSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialMorsaSpringApplication {

	private static Logger logger = LoggerFactory.getLogger(TutorialMorsaSpringApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(TutorialMorsaSpringApplication.class, args);

		logger.debug("Mi mensaje debug");
		/*logger.info("Mi mensaje info");
		logger.warn("Mi mensaje warn");
		logger.error("Mi mensaje error");*/


	}

}
