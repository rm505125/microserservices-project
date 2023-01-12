package com.code.microserveces.Currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.microserveces.Currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

	public CurrencyExchange findByFromAndTo(String from,String to);
}
