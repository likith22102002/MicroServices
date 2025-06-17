package com.microservices.currency_conversion_services;

import java.math.BigDecimal;


public class CurrencyConversion {
	 
	    private long id;
	    private String from;
	    private String to;
	    private BigDecimal conversionMultiple;
	    private BigDecimal quantity;
	    private BigDecimal totalamount;
	    public CurrencyConversion() {
	    	
	    }
		public CurrencyConversion(long id, String from, String to, BigDecimal quantity,BigDecimal conversionMultiple
				,BigDecimal totalamount) {
			super();
			this.id = id;
			this.from = from;
			this.to = to;
			this.quantity = quantity;
			this.conversionMultiple = conversionMultiple;
			this.totalamount = totalamount;
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
		public BigDecimal getQuantity() {
			return quantity;
		}
		public void setQuantity(BigDecimal quantity) {
			this.quantity = quantity;
		}
		public BigDecimal getTotalamount() {
			return totalamount;
		}
		public void setTotalamount(BigDecimal totalamount) {
			this.totalamount = totalamount;
		}

	
	
}
