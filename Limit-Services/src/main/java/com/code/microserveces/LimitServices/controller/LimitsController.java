package com.code.microserveces.LimitServices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.microserveces.LimitServices.configuration.CustomConfiguration;
import com.code.microserveces.LimitServices.entity.Limits;

@RestController
@RequestMapping("/v1")
public class LimitsController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	// Dependency injection for configuration class
	private CustomConfiguration configuration;

	public LimitsController(CustomConfiguration configuration) {
		super();
		this.configuration = configuration;
	}

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		// return new Limits(1,1000);

		// reading values which are defined in application.properties with the
		// help of Configuration class.
		logger.info("Minimum: "+configuration.getMinimum()+" Maximum: "+configuration.getMaximum());
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}

}
