package com.cognixia.ems.department;

public class Department {
	
	private int deptId;
	private String deptName;
	private String deptPhoneNum;
	private static int counter = 1;
	
	// constructor
	public Department(String deptName, String deptPhoneNum) {
		super();
		this.deptId = counter++;
		this.deptName = deptName;
		this.setDeptPhoneNum(deptPhoneNum);
	}

	// getters setters
	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptPhoneNum() {
		return deptPhoneNum;
	}

	public void setDeptPhoneNum(String deptPhoneNum) {
		this.deptPhoneNum = deptPhoneNum;
	}

	@Override
	public String toString() {
		return "Department deptId=" + deptId + ", deptName=" + deptName + ", phoneNum=" + deptPhoneNum + "]";
	}
	
}
