package com.microservices.currency_conversion_services;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	@Autowired
	private CurrencyExchangeProxy proxy;
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calcultaeCurrencyConversion(@PathVariable String from,
			@PathVariable String  to
			,@PathVariable BigDecimal quantity) {
		
		HashMap<String, String> uriVariables =new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversion> responseentity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
		CurrencyConversion currencyConversion = responseentity.getBody();
		return new  CurrencyConversion(currencyConversion.getId(),from,to,quantity,currencyConversion.getConversionMultiple(),quantity.multiply(currencyConversion.getConversionMultiple()));
		
	}
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calcultaeCurrencyConversionFeign(@PathVariable String from,
			@PathVariable String  to
			,@PathVariable BigDecimal quantity) {
		
		
		CurrencyConversion currencyConversion = proxy.retrieveAllData(from, to);
		return new  CurrencyConversion(currencyConversion.getId(),from,to,quantity,currencyConversion.getConversionMultiple(),quantity.multiply(currencyConversion.getConversionMultiple()));
		
	}


}
