package com.jkxy.service;

import java.util.List;

import com.jkxy.model.Consume;

public interface IConsumeService {

	List getAllConsume();
	List getConsumePaging(int currentPage,int pageSize);
	Consume getConsumeById(int id);
	boolean addConsume(Consume consume);
	Consume getLastConsume();
}
