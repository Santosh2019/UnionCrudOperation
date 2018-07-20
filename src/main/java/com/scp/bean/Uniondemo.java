package com.scp.bean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import  javax.persistence.Id;
@Entity
@Table
public class Uniondemo {
	
	private String labourName;
	@Id
	private int Id;
	private long AadharNumber;
	private String gender;
	public Uniondemo(String labourName, int id, long aadharNumber, String gender) {
		super();
		this.labourName = labourName;
		Id = id;
		AadharNumber = aadharNumber;
		this.gender = gender;
	}
	public String getLaborName() {
		return labourName;
	}
	public int getId() {
		return Id;
	}
	public long getAadharNumber() {
		return AadharNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setLaborName(String laborName) {
		this.labourName = laborName;
	}
	public void setId(int id) {
		Id = id;
	}
	public void setAadharNumber(long aadharNumber) {
		AadharNumber = aadharNumber;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "\n Name :" + labourName + " |   \tId :" + Id + " | \tAadhar Number :" + AadharNumber + " | \tGender :" + gender+ "";
	}
}
