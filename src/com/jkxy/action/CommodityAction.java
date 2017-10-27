package com.jkxy.action;

import java.util.List;
import java.util.Map;

import com.jkxy.model.Commodity;
import com.jkxy.service.ICommodityService;
import com.jkxy.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CommodityAction extends ActionSupport {
	private ICommodityService commodityService;
	private int currentPage = 1;
	private Commodity commodity;
	private int commodityId;

	
	
	public ICommodityService getCommodityService() {
		return commodityService;
	}

	public void setCommodityService(ICommodityService commodityService) {
		this.commodityService = commodityService;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	

	public int getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(int commodityId) {
		this.commodityId = commodityId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String addCommodity() throws Exception {
		int currentCommodityId=1;
		if (commodityService.getLastCommodity()!=null) {
			Commodity Commodity1 = (Commodity) commodityService.getLastCommodity();
			currentCommodityId = Commodity1.getCommodityId() + 1;
		}
		Commodity commodity2 = new Commodity();
		commodity2.setCommodityId(currentCommodityId);
		commodity2.setCommodityName(commodity.getCommodityName());
		commodity2.setPrice(commodity.getPrice());
		commodity2.setAgio(commodity.getAgio());
		if (commodityService.addCommodity(commodity2)) {
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("tipMessage", "添加成功！");
		} else {
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("tipMessage", "添加失败！");
		}
		return SUCCESS;
	}
	
	public String getCommodityById() throws Exception{
		commodity=commodityService.getCommodityById(commodityId);
		Map request=(Map)ActionContext.getContext().get("request");
		if(commodity==null){
			request.put("tipMessage", "没有查询到该产品编号的记录！");
		}else{
			request.put("commodity", commodity);
		}
		return SUCCESS;
	}
	
	
	public String browseCommodityPaging() throws Exception {
		int totalSize = commodityService.getAllCommodity().size();
		Pager page = new Pager(currentPage, totalSize);
		List commoditys = commodityService.getCommodityPaging(currentPage, page.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("Commoditys", commoditys);
		request.put("page", page);
		return SUCCESS;

	}
	
	public String browseAllCommodityPaging() throws Exception{
		List commoditys=commodityService.getAllCommodity();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("Commoditys", commoditys);
		return SUCCESS;
	}
	
/*	public String displayOneCommodity() throws Exception{
		Commodity modifyCommodity=commodityService.getCommodityById(commodityid);
		System.out.println("modify");
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("Commodity", modifyCommodity);
		return SUCCESS;
	}*/
	
/*	public String deleteOneCommodity() throws Exception{
		commodityService.deleteCommodityById(commodityid);
		System.out.println("delete");
		return SUCCESS;
	}*/
	
	
	
	
	
	

}
