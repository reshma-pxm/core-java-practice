package com.polymorphism;

public class MethodOverriding2 extends MethodOverriding1 
 {
	
	void test(String a,int b) {
		super.test(b, a);
		System.out.println("override 2");
		
	}

	

}
