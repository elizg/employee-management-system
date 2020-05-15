package com.cognixia.ems.department;

public class Department {
	
	private int deptId;
	private int deptName;
	private String phoneNum;
	private static int counter = 1;
	
	// constructor
	public Department(int deptName, String phoneNum) {
		super();
		this.deptId = counter++;
		this.deptName = deptName;
		this.setPhoneNum(phoneNum);
	}

	// getters setters
	public int getDeptId() {
		return deptId;
	}

	public int getDeptName() {
		return deptName;
	}

	public void setDeptName(int deptName) {
		this.deptName = deptName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", phoneNum=" + phoneNum + "]";
	}
	
}
