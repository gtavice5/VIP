package com.jkxy.service;

import com.jkxy.model.Vip;

public interface IVipService {

	Vip getVipById(int id);
	boolean addVip(Vip vip);
	Vip getLastVip();
}
