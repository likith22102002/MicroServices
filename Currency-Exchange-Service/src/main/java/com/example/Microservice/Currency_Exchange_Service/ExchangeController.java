package com.example.Microservice.Currency_Exchange_Service;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class ExchangeController {
	

    @Autowired
    private CurrencyExchangeRepository repository;

    

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveAllData(@PathVariable String from, @PathVariable String to) {
        CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
        if (currencyExchange == null) {
            throw new RuntimeException("Unable to find data for " + from + " to " + to);
        }
        return currencyExchange;
    }
}
