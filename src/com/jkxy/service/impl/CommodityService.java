package com.jkxy.service.impl;

import java.util.List;

import com.jkxy.dao.impl.CommodityDAO;
import com.jkxy.model.Commodity;
import com.jkxy.service.ICommodityService;

public class CommodityService implements ICommodityService{
	private CommodityDAO commodityDAO;
	
	

	public CommodityDAO getcommodityDAO() {
		return commodityDAO;
	}

	public void setcommodityDAO(CommodityDAO commodityDAO) {
		this.commodityDAO = commodityDAO;
	}


	@Override
	public List getCommodityPaging(int currentPage, int pageSize) {
		return commodityDAO.getCommodityPaging( currentPage, pageSize);
	}


	@Override
	public Commodity getCommodityById(int id) {
		return commodityDAO.getCommodityById(id);
	}


	@Override
	public boolean addOrUpdateCommodity(Commodity commodity) {
		return commodityDAO.addOrUpdateCommodity(commodity);
	}


	@Override
	public List getAllCommodity() {
		return commodityDAO.getAllCommodity();
	}


	@Override
	public boolean deleteCommodityById(int id) {
		return commodityDAO.deleteCommodityById(id);
	}

	@Override
	public List searchCommodityByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commodity searchCommodityById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commodity getLastCommodity() {
		return commodityDAO.getLastCommodity();
	}

	@Override
	public boolean addCommodity(Commodity commodity) {
		return commodityDAO.addCommodity(commodity);
	}

}
