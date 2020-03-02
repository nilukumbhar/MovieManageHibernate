package com.techdenovo.moviemanagehibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techdenovo.Utility.HiberUtility;
import com.techdenovo.moviemanagehibernate.model.User;

public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory=HiberUtility.getSessionFactory();
     
	public void saveUser(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
	}

	@Override
	public User findUserByUserName(String username) {
		Session session = sessionFactory.openSession();
		User user =session.get(User.class, username);
		session.close();
		return user;
    }
}










