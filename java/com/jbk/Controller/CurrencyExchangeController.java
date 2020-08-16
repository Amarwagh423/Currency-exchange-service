package com.jbk.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Configuration.ExchangeValue;
import com.jbk.Repository.ExchangeValueRepo;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
     Environment environment;
	
	@Autowired
	ExchangeValueRepo repository;

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
    ExchangeValue exchangeValue=repository.findByFromAndTo(from, to);
    exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
    return exchangeValue;
	}

}
