package com.scp.ServiceImplementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.Dao.UnionDao;
import com.scp.DaoImpl.DaoImpl;
import com.scp.Service.Service;
import com.scp.Utility.Utility;
import com.scp.bean.Uniondemo;

public class ServiceImplementation implements Service {

	// Configuration configuration=new Configuration();
	SessionFactory sessionFactory = Utility.getsessionFactory(); // configuration.configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	UnionDao unionDao=new DaoImpl(); 
	public Uniondemo addunion(Uniondemo union) {
		Transaction transaction = session.beginTransaction();
		session.save(union);
		session.flush();
		transaction.commit();
		return union;

	}

	public List<Uniondemo> getAllUnion() {
		Uniondemo uniondemo = session.get(Uniondemo.class, 101);
		System.out.println(uniondemo);
		return unionDao.getListofUnion();

		// Union union1= session.get(Union.class, 1);

		// System.out.println(union1);

		// return dao.getListofUnion();
	}

}
