package com.jkxy.action;

import java.util.List;
import java.util.Map;

import com.jkxy.model.Vip;
import com.jkxy.service.IVipService;
import com.jkxy.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class VipAction extends ActionSupport {
	private IVipService vipService;
	private int currentPage = 1;
	private Vip vip;
	private int vipId;
	
	

	public IVipService getVipService() {
		return vipService;
	}

	public void setVipService(IVipService vipService) {
		this.vipService = vipService;
	}

	public Vip getVip() {
		return vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}

	public int getVipId() {
		return vipId;
	}

	public void setVipId(int vipId) {
		this.vipId = vipId;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String addVip() throws Exception {
		int currentVipId=1;
		if (vipService.getLastVip()!=null) {
			Vip Vip1 = (Vip) vipService.getLastVip();
			currentVipId = Vip1.getVipId() + 1;
		}
		Vip Vip2 = new Vip();
		Vip2.setVipId(currentVipId);
		Vip2.setName(vip.getName());
		Vip2.setAge(vip.getAge());
		Vip2.setProfession(vip.getProfession());
		Vip2.setJoinTime(vip.getJoinTime());
		if (vipService.addVip(Vip2)) {
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("tipMessage", "添加成功！");
		} else {
			Map request=(Map)ActionContext.getContext().get("request");
			request.put("tipMessage", "添加失败！");
		}
		return SUCCESS;
	}
	
	public String getVipById() throws Exception{
		vip=vipService.getVipById(vipId);
		Map request=(Map)ActionContext.getContext().get("request");
		if(vip==null){
			request.put("tipMessage", "没有查询到该产品编号的记录！");
		}else{
			request.put("vip", vip);
		}
		return SUCCESS;
	}
	
	
/*	public String browseVipPaging() throws Exception {
		int totalSize = VipService.getAllVip().size();
		Pager page = new Pager(currentPage, totalSize);
		List Vips = VipService.getVipPaging(currentPage, page.getPageSize());
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("Vips", Vips);
		request.put("page", page);
		return SUCCESS;

	}
	
	public String browseAllVipPaging() throws Exception{
		List Vips=VipService.getAllVip();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("Vips", Vips);
		return SUCCESS;
	}*/
	
	
	
	
	
	

}
