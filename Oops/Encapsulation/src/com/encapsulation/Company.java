package com.encapsulation;

public class Company {
	
	private int emp_id;// var private
	
	
	public int getEmp_id() {//view
		return emp_id;
	}


	public void setEmp_id(int emp_id) {//modify data
		this.emp_id = emp_id;
	}




	public static void main(String[] args) {
		
		Company c = new Company();
		c.setEmp_id(101);// call method by ref var and set data
		System.out.println(c.getEmp_id());//call method by ref var and get data

	}

}
