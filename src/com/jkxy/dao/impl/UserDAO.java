package com.jkxy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jkxy.dao.IUserDAO;
import com.jkxy.model.User;
import com.jkxy.model.Vip;

public class UserDAO implements IUserDAO {

	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public User checkUser(User user) throws Exception{
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where username='"+user.getUsername()
		+"' and password='"+user.getPassword()+"'");
		User user1=new User();
		List list=query.list();
		ts.commit();
		session.close();
		if(list.size()!=0){
			user1=(User)list.get(0);
			return user1;
		}
		return null;
	}



	@Override
	public boolean removeUser(String username) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where username='"+username+"'");
		User user1=(User)(query.list().get(0));
		user1.setQuanxian(2);
		session.update(user1);
		ts.commit();
		session.close();
		return true;
	}



	@Override
	public boolean grantUser(String username) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where username='"+username+"'");
		User user1=(User)(query.list().get(0));
		user1.setQuanxian(0);
		session.update(user1);
		ts.commit();
		session.close();
		return true;
	}



	@Override
	public User getUserByName(String username) {
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where username='"+username+"'");
		List users=query.list();
		ts.commit();
		session.close();
		if(users.size()!=0){
			User user1=(User)users.get(0);
			return user1;
		}
		return null;
	}
 
}
