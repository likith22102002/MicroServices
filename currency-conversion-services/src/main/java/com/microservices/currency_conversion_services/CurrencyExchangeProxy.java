package com.microservices.currency_conversion_services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



//@FeignClient(name="Currency-Exchange-Service",url="localhost:8000")
@FeignClient(name="Currency-Exchange-Service")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
	    public CurrencyConversion retrieveAllData(@PathVariable String from, @PathVariable String to);
}
