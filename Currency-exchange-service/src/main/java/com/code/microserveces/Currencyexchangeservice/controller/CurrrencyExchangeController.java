package com.code.microserveces.Currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.code.microserveces.Currencyexchangeservice.entity.CurrencyExchange;
import com.code.microserveces.Currencyexchangeservice.service.CurrencyExchangeService;

@RestController
public class CurrrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeService service;

	/*
	 * 
	 * static data 
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currencyExchange = new CurrencyExchange(1000L,from ,to,BigDecimal.valueOf(50));
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}*/
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange retrieveExchangeValue = service.retrieveExchangeValue(from,to);
		String port = environment.getProperty("local.server.port");
		retrieveExchangeValue.setEnvironment(port);
		return retrieveExchangeValue;
	}
}
