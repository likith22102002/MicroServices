package com.example.Microservice.Currency_Exchange_Service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {
	@Autowired
	private Environment envirnoment;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange reteriveAllDAta(@PathVariable String from,@PathVariable String to) {
		CurrencyExchange currencyexchange= new CurrencyExchange (1001L,"USD","INR",BigDecimal.valueOf(65.0));
		String port = envirnoment.getProperty("local.server.port");
		currencyexchange.setEnvinorment(port);
		return currencyexchange;
	}

}
