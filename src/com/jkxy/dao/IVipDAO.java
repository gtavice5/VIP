package com.jkxy.dao;

import com.jkxy.model.Vip;

public interface IVipDAO {

	Vip getVipById(int id);
	boolean addVip(Vip vip);
	Vip getLastVip();
}
