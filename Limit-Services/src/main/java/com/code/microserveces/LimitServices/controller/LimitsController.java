package com.code.microserveces.LimitServices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.microserveces.LimitServices.entity.Limits;


@RestController
@RequestMapping("/v1")
public class LimitsController {

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(1,1000);
	}
	
}
