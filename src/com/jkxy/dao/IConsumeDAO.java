package com.jkxy.dao;

import java.util.List;

import com.jkxy.model.Consume;

public interface IConsumeDAO {

	List getAllConsume();
	List getConsumePaging(int currentPage,int pageSize);
	Consume getConsumeById(int id);
	boolean addConsume(Consume consume);
	Consume getLastConsume();
}
