package com.scp.ServiceImplementation;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.scp.Dao.UnionDao;
import com.scp.DaoImpl.DaoImpl;
import com.scp.Service.Service;
import com.scp.Utility.Utility;
import com.scp.bean.Uniondemo;

public class ServiceImplementation implements Service{

	//Configuration configuration=//new Configuration();
	SessionFactory sessionFactory=Utility.getsessionFactory();
	Session session;
	//UnionDao dao=new DaoImpl();
	public boolean addunion(Uniondemo union) {
		Transaction tr1 = null;
	//	session=Utility.fulshNCommit(session, );
		session.save(union);

		session=Utility.fulshNCommit(session, tr1);
		//session.flush();
		//tr.commit();
		return true;
		
	}

	public List<Uniondemo> getAllUnion(Uniondemo uniondemo2) {
		Uniondemo uniondemo=session.get(Uniondemo.class, 189);
		System.out.println(uniondemo.getLaborName());
		System.out.println(uniondemo.getAadharNumber());
		System.out.println(uniondemo.getGender());
	//	System.out.println(uniondemo.getId());
		
		return getAllUnion(uniondemo);
		
		//Union union1= session.get(Union.class, 1);
		
//		System.out.println(union1);
		
		//return dao.getListofUnion();
	}

}
