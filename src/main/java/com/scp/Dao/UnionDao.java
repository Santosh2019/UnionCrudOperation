package com.scp.Dao;

import java.util.List; 

import com.scp.bean.Uniondemo;

public interface UnionDao {
	
	public boolean addUnion(Uniondemo union);
	public List<Uniondemo>getListofUnion();

}
