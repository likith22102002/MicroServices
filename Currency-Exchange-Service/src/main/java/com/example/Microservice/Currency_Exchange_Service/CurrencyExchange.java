package com.example.Microservice.Currency_Exchange_Service;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "currencyexchange")
public class CurrencyExchange {
    
    @Id
    @Column(name = "currency_id")
    private long id;

    @Column(name = "currency_from") 
    private String from;

    @Column(name = "currency_to") 
    private String to;

    @Column(name = "conversion_multiple") 
    private BigDecimal conversionMultiple;


    public CurrencyExchange() {
    }

    public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

   

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
    @Override
   	public String toString() {
   		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
   				+ conversionMultiple + "]";
   	}   
}
