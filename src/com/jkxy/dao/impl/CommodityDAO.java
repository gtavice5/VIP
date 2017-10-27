package com.jkxy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jkxy.dao.ICommodityDAO;
import com.jkxy.model.Commodity;

public class CommodityDAO implements ICommodityDAO {
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public List getCommodityPaging(int currentPage, int pageSize) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Commodity");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List commoditys=query.list();
		ts.commit();
		session.close();
		return commoditys;
	}


	@Override
	public List getAllCommodity() {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Commodity order by catalogid desc");
		List commoditys=query.list();
		
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return commoditys;
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
	public boolean deleteCommodityById(int id) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Commodity where CommodityId="+id);
		List commoditys=query.list();
		session.delete((Commodity) commoditys.get(0));
		ts.commit();
		session.close();
		return true;
	}



	@Override
	public Commodity getCommodityById(int id) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Commodity where CommodityId="+id);
		List commoditys=query.list();
		ts.commit();
		session.close();
		return (Commodity) commoditys.get(0);
	}



	@Override
	public boolean addOrUpdateCommodity(Commodity commodity) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		session.saveOrUpdate(commodity);
		
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return true;
	}



	@Override
	public Commodity getLastCommodity() {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Commodity order by commodityId desc");
		query.setFirstResult(0);
		query.setMaxResults(1);
		List commoditys=query.list();
		ts.commit();
		session.close();
		if (commoditys.size()!=0) {
			return (Commodity) commoditys.get(0);
		}else{
			return null;
		}
		
	}



	@Override
	public boolean addCommodity(Commodity commodity) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		session.save(commodity);
		
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return true;
	}

	
	
	
	
	
	
	
	
	
}
