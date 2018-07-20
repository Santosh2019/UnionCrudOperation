package com.scp.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Utility {
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getsessionFactory() {
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
			
		}
		return sessionFactory;
		
	}
	public static Session fulshNCommit(Session session1, Transaction tr) {
		if(session1!=null) {
			session1.flush();
		}
		if(tr!=null) {
			tr.commit();
		}
		return session1;
	}
	public static void closeSession(Session session, SessionFactory sessionFactory) {
		if(session!=null) {
			session.close();
		}
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
		
	}

}
