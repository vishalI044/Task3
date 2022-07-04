package com;

import java.util.Hashtable;

public class LoginUserData {
	public  int empCode;
	public String name;
	public int salary;
	
	public LoginUserData(int empCode, String name, int salary) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "LoginUserData [empCode=" + empCode + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
