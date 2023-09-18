package com.mzos;

public class Student {

	private int studId;
	private String studName;
	private String studCollege;
	private Address studAddress;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, String studCollege, Address studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studCollege = studCollege;
		this.studAddress = studAddress;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCollege() {
		return studCollege;
	}

	public void setStudCollege(String studCollege) {
		this.studCollege = studCollege;
	}

	public Address getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCollege=" + studCollege
				+ ", studAddress=" + studAddress + "]";
	}

	 
	
}


