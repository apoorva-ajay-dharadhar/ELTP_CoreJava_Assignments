package com.psl.classes;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
	private String FirstName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	private int EmpId;
	private Date joiningDate;
	
	
		
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", EmpId=" + EmpId + ", joiningDate=" + joiningDate + "]";
	}
	
	
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getEmpId() - o.getEmpId();
		
	}
	

}
