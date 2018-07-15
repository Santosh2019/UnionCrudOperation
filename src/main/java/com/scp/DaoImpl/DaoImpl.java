package com.scp.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.scp.Dao.UnionDao;
import com.scp.bean.Union;

public class DaoImpl implements UnionDao{

	List<Union>list=new ArrayList<Union>();
	
	
	public boolean addUnion(Union union) {
		// TODO Auto-generated method stub
		return list.add(union);
	}

	public List<Union> getListofUnion() {
		// TODO Auto-generated method stub
		return list;
	}
}
