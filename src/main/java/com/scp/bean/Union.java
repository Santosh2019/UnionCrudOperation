package com.scp.bean;

public class Union {

	private String laborName;
	private int Id;
	private long AadharNumber;
	private String gender;
	public Union(String laborName, int id, long aadharNumber, String gender) {
		super();
		this.laborName = laborName;
		Id = id;
		AadharNumber = aadharNumber;
		this.gender = gender;
	}
	public String getLaborName() {
		return laborName;
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
		this.laborName = laborName;
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
		return "\n Name :" + laborName + " |   \tId :" + Id + " | \tAadhar Number :" + AadharNumber + " | \tGender :" + gender+ "";
	}
	

}
