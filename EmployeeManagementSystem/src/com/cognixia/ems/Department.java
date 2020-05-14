package com.cognixia.ems;

public class Department {
	
	private int deptId;
	private int deptName;
	
	// constructor
	public Department(int deptId, int deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	// getters setters
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getDeptName() {
		return deptName;
	}

	public void setDeptName(int deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
