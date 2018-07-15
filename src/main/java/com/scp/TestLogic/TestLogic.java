package com.scp.TestLogic;

import com.scp.Service.Service;
import com.scp.ServiceImplementation.ServiceImplementation;
import com.scp.bean.Union;

public class TestLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Union union1=new Union("Denanath",189,818092379365L,"Male"); 
		Union union2=new Union("Badri",189,918092379365L,"Male"); 
		Union union3=new Union("Venketesh",200,779818092379365L,"Male"); 
		Union union4=new Union("LaxmiPati",201,669818092379365L,"Male"); 
		Service service=new ServiceImplementation();
		service.addunion(union1);
		service.addunion(union2);
		service.addunion(union3);
		service.addunion(union4);
		System.out.println("This is Union List"+service.getAllUnion());

	}

}
