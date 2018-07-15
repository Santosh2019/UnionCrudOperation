package com.scp.ServiceImplementation;

import java.util.List;

import com.scp.Dao.UnionDao;
import com.scp.DaoImpl.DaoImpl;
import com.scp.Service.Service;
import com.scp.bean.Union;

public class ServiceImplementation implements Service{
	
	UnionDao dao=new DaoImpl();

	public boolean addunion(Union union) {
		// TODO Auto-generated method stub
		return dao.addUnion(union);
	}

	public List<Union> getAllUnion() {
		// TODO Auto-generated method stub
		return dao.getListofUnion();
	}

}
