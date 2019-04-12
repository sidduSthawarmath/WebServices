package com.siddu.restful.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private int rollNum;
	private String name;
	private String phoneNum;

	// Default constructor is mandatory other wise it will give response as internal
	// server error
	public Student() {
	}

	public Student(int rollNum, String name, String phoneNum) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", phoneNum=" + phoneNum + "]";
	}

	

	

}
