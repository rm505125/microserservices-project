package com.code.microserveces.Currencyexchangeservice.service;

import org.springframework.stereotype.Service;

import com.code.microserveces.Currencyexchangeservice.entity.CurrencyExchange;
import com.code.microserveces.Currencyexchangeservice.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeService {

	private CurrencyExchangeRepository repository;
	
	public CurrencyExchangeService(CurrencyExchangeRepository repository) {
		super();
		this.repository = repository;
	}

	public CurrencyExchange retrieveExchangeValue(String from, String to) {
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		if(currencyExchange == null) {
			throw new RuntimeException("Unable to find data for "+from+" to "+to);
		}
		return currencyExchange;
	}

	
	
	
	
}
