package com.jkxy.action;

import java.util.List;
import java.util.Map;

import com.jkxy.model.Commodity;
import com.jkxy.model.Consume;
import com.jkxy.model.Vip;
import com.jkxy.service.ICommodityService;
import com.jkxy.service.IConsumeService;
import com.jkxy.service.IVipService;
import com.jkxy.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ConsumeAction extends ActionSupport {
	private IConsumeService consumeService;
	private ICommodityService commodityService;
	private IVipService vipService;
	private int currentPage = 1;
	private Consume consume;
	private int consumeId;
	private int vipId;
	private int commodityId;

	public ICommodityService getCommodityService() {
		return commodityService;
	}

	public void setCommodityService(ICommodityService commodityService) {
		this.commodityService = commodityService;
	}

	public IVipService getVipService() {
		return vipService;
	}

	public void setVipService(IVipService vipService) {
		this.vipService = vipService;
	}

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public int getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}

	public IConsumeService getConsumeService() {
		return consumeService;
	}

	public void setConsumeService(IConsumeService consumeService) {
		this.consumeService = consumeService;
	}

	public Consume getConsume() {
		return consume;
	}

	public void setConsume(Consume consume) {
		this.consume = consume;
	}

	public int getConsumeId() {
		return consumeId;
	}

	public void setConsumeId(int consumeId) {
		this.consumeId = consumeId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String addConsume() throws Exception {
		int currentconsumeId = 1;
		if (consumeService.getLastConsume() != null) {
			Consume consume1 = (Consume) consumeService.getLastConsume();
			currentconsumeId = consume1.getConsumeId() + 1;
		}
		Consume consume2 = new Consume();
		consume2.setConsumeId(currentconsumeId);
		Vip vip = vipService.getVipById(vipId);
		consume2.setVip(vip);
		consume2.setName(vip.getName());
		Commodity commodity = commodityService.getCommodityById(commodityId);
		consume2.setCommodity(commodity);
		consume2.setCommodityName(commodity.getCommodityName());
		consume2.setPrice(commodity.getPrice());
		consume2.setPracticePrice(commodity.getPrice().multiply(commodity.getAgio()));
		if (consumeService.addConsume(consume2)) {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("tipMessage", "添加成功！");
		} else {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("tipMessage", "添加失败！");
		}
		return SUCCESS;
	}

	public String browseConsumePaging() throws Exception {
		int totalSize = consumeService.getAllConsume().size();
		Pager page = new Pager(currentPage, totalSize);
		List consumes = consumeService.getConsumePaging(currentPage, page.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("consumes", consumes);
		request.put("page", page);
		return SUCCESS;

	}
	
	/*
	 * public String getConsumeById() throws Exception{
	 * consume=consumeService.getConsumeById(consumeId); Map
	 * request=(Map)ActionContext.getContext().get("request");
	 * if(consume==null){ request.put("tipMessage", "没有查询到该产品编号的记录！"); }else{
	 * request.put("consume", consume); } return SUCCESS; }
	 */

}
