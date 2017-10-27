package com.jkxy.model;

import java.math.BigDecimal;

public class Consume {

	private int consumeId;
	private Vip vip;
	private String name;
	private Commodity commodity;
	private String commodityName;
	private BigDecimal price;
	private BigDecimal practicePrice;
	
	public Consume() {
		
	}

	public int getConsumeId() {
		return consumeId;
	}

	public void setConsumeId(int consumeId) {
		this.consumeId = consumeId;
	}

	public Vip getVip() {
		return vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
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

	public BigDecimal getPracticePrice() {
		return practicePrice;
	}

	public void setPracticePrice(BigDecimal practicePrice) {
		this.practicePrice = practicePrice;
	}
	
	
}
