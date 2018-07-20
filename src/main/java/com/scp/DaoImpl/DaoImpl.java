package com.scp.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.scp.Dao.UnionDao;
import com.scp.bean.Uniondemo;

public class DaoImpl implements UnionDao{

	List<Uniondemo>list=new ArrayList<Uniondemo>();
	
	
	public boolean addUnion(Uniondemo union) {
		// TODO Auto-generated method stub
		return list.add(union);
	}

	public List<Uniondemo> getListofUnion() {
		// TODO Auto-generated method stub
		return list;
	}
}
