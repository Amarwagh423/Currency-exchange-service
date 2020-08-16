package com.jbk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbk.Configuration.ExchangeValue;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Long>{

	
	ExchangeValue findByFromAndTo(String from,String to);
	
}
