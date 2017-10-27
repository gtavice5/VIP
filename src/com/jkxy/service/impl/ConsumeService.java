package com.jkxy.service.impl;

import java.util.List;

import com.jkxy.dao.IConsumeDAO;
import com.jkxy.model.Consume;
import com.jkxy.service.IConsumeService;

public class ConsumeService implements IConsumeService{

	private IConsumeDAO consumeDAO;

	
	
	public IConsumeDAO getConsumeDAO() {
		return consumeDAO;
	}

	public void setConsumeDAO(IConsumeDAO consumeDAO) {
		this.consumeDAO = consumeDAO;
	}

	@Override
	public List getConsumePaging(int currentPage, int pageSize) {
		return consumeDAO.getConsumePaging(currentPage, pageSize);
	}

	@Override
	public Consume getConsumeById(int id) {
		return consumeDAO.getConsumeById(id);
	}

	@Override
	public boolean addConsume(Consume consume) {
		return consumeDAO.addConsume(consume);
	}

	@Override
	public Consume getLastConsume() {
		return consumeDAO.getLastConsume();
	}

	@Override
	public List getAllConsume() {
		return consumeDAO.getAllConsume();
	}
	
	
}
