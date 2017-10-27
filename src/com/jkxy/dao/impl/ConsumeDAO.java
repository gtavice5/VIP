package com.jkxy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jkxy.dao.IConsumeDAO;
import com.jkxy.model.Consume;

public class ConsumeDAO implements IConsumeDAO {
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public List getConsumePaging(int currentPage, int pageSize) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Consume");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List Consumes=query.list();
		ts.commit();
		session.close();
		return Consumes;
	}



	@Override
	public Consume getConsumeById(int id) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Consume where consumeId="+id);
		List Consumes=query.list();
		ts.commit();
		session.close();
		return (Consume) Consumes.get(0);
	}



	@Override
	public Consume getLastConsume() {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Consume order by consumeId desc");
		query.setFirstResult(0);
		query.setMaxResults(1);
		List Consumes=query.list();
		ts.commit();
		session.close();
		if (Consumes.size()!=0) {
			return (Consume) Consumes.get(0);
		}else{
			return null;
		}
		
	}



	@Override
	public boolean addConsume(Consume consume) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		session.save(consume);
		
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return true;
	}



	@Override
	public List getAllConsume() {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Consume order by consumeId desc");
		List consumes=query.list();
		
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return consumes;
	}

	
	
	
	
	
	
	
	
	
}
