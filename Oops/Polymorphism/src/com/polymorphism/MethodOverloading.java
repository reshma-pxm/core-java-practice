package com.polymorphism;

 class MethodOverloading {
	
	void show(String d,int f) {
		int a = 10;
		int b = 20;
		int c= a*b;
		System.out.println("result is " +a+" x "+b+"="+c);
	}
	void show(int x, String f) {
		int a = 10;
		int b = 20;
		int c= a+b; 
		System.out.println("result is " +a+"+"+b+" = "+c);
	}

	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.show("anji",10);

	}

}
