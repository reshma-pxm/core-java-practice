package com.abstraction;

 abstract class Vehicle {
	 
	 abstract void start();

 
	 public static void main(String[] args) {
			Car obj1=new Car();
			obj1.start();
			Scooter obj2=new Scooter();
			obj2.start();
		}
		
 }
	


