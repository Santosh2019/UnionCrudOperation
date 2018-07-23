package com.scp.TestLogic;

import com.scp.Service.Service;
import com.scp.ServiceImplementation.ServiceImplementation;
import com.scp.bean.Uniondemo;
public class TestLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uniondemo union1 = new Uniondemo("Denanath", 101, 818092379365L, "Male");
		Uniondemo union2 = new Uniondemo("Badri", 102, 918092379365L, "Male");
		Uniondemo union3 = new Uniondemo("Venketesh", 103, 958092379365L, "Male");
		Uniondemo union4 = new Uniondemo("LaxmiPati", 104, 918092379365L, "Male");
		System.out.println("Hello");
		Service service = new ServiceImplementation();
		service.addunion(union1);
		service.addunion(union2);
		service.addunion(union3);
		service.addunion(union4);
	 System.out.println(service.getAllUnion());
	
		
		
		
		
		
		/*System.out.println(service.addunion(union1));
		service.addunion(union2);
		service.addunion(union3);
		service.addunion(union4);*/
	}

}
