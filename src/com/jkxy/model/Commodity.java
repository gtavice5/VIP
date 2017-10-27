package com.jkxy.model;

import java.math.BigDecimal;
import java.util.Set;

public class Commodity {

	private int commodityId;
	private String commodityName;
	private BigDecimal price;
	private BigDecimal agio;
	private Set<Consume> consumes;
	
	public Commodity() {
		
	}

	public int getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getAgio() {
		return agio;
	}

	public void setAgio(BigDecimal agio) {
		this.agio = agio;
	}

	public Set<Consume> getConsumes() {
		return consumes;
	}

	public void setConsumes(Set<Consume> consumes) {
		this.consumes = consumes;
	}
	
	
	
}
