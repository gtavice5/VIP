package com.jkxy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jkxy.dao.IVipDAO;
import com.jkxy.model.Vip;

public class VipDAO implements IVipDAO {
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public Vip getVipById(int id) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Vip where VipId="+id);
		List Vips=query.list();
		ts.commit();
		session.close();
		return (Vip) Vips.get(0);
	}



	@Override
	public Vip getLastVip() {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Vip order by VipId desc");
		query.setFirstResult(0);
		query.setMaxResults(1);
		List Vips=query.list();
		ts.commit();
		session.close();
		if (Vips.size()!=0) {
			return (Vip) Vips.get(0);
		}else{
			return null;
		}
		
	}



	@Override
	public boolean addVip(Vip vip) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		session.save(vip);
		
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return true;
	}
	
	
	
	
	
	
	
	
	
}
