package com.themakers.employmentmanagement.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUtil {

	public static Session getSession(SessionFactory sessionFactory) {
		Session session = sessionFactory.getCurrentSession();
		if(session == null) {
			session = sessionFactory.getCurrentSession();
		}
		return session;
	}
	
}
