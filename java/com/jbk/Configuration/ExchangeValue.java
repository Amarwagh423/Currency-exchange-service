package com.jbk.Configuration;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private long id;

	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal converstionMultiple;
	private int port;

	public ExchangeValue() {

	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue(long id, String from, String to, BigDecimal converstionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.converstionMultiple = converstionMultiple;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getConverstionMultiple() {
		return converstionMultiple;
	}

	public void setConverstionMultiple(BigDecimal converstionMultiple) {
		this.converstionMultiple = converstionMultiple;
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

}
