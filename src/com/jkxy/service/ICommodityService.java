package com.jkxy.service;

import java.util.List;

import com.jkxy.model.Commodity;

public interface ICommodityService {

	public List getAllCommodity();
	public List getCommodityPaging(int currentPage,int pageSize);
	public List searchCommodityByName(String name);
	public Commodity searchCommodityById(int id);
	public boolean deleteCommodityById(int id);
	public Commodity getCommodityById(int id);
	public boolean addOrUpdateCommodity(Commodity Commodity);
	Commodity getLastCommodity();
	public boolean addCommodity(Commodity commodity);
}
