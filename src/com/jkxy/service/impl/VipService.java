package com.jkxy.service.impl;

import com.jkxy.dao.IVipDAO;
import com.jkxy.dao.impl.CommodityDAO;
import com.jkxy.model.Vip;
import com.jkxy.service.IVipService;

public class VipService implements IVipService {
	private IVipDAO vipDAO;
	
	
	public IVipDAO getVipDAO() {
		return vipDAO;
	}

	public void setVipDAO(IVipDAO vipDAO) {
		this.vipDAO = vipDAO;
	}

	@Override
	public Vip getVipById(int id) {
		return vipDAO.getVipById(id);
	}

	@Override
	public boolean addVip(Vip vip) {
		return vipDAO.addVip(vip);
	}

	@Override
	public Vip getLastVip() {
		return vipDAO.getLastVip();
	}

}
