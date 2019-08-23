package com.info.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.info")
@EntityScan("com.info.domain")
@EnableJpaRepositories("com.info.repository")
public class PlantInformationApplication {
    private static final Logger logger = LogManager.getLogger(PlantInformationApplication.class);

	public static void main(String[] args) {
		logger.debug("Debugging log");
        logger.info("Info log");
        logger.warn("Hey, This is a warning!");
        logger.error("Oops! We have an Error. OK");
        logger.fatal("Damn! Fatal error. Please fix me.");
		SpringApplication.run(PlantInformationApplication.class, args);
	}

}
