package com.ifelse;

import java.util.Scanner;

public class Hike {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scan>>initialize>>print>>method init
		int employee_exp;
		System.out.println("enter employee exp:");
		employee_exp=sc.nextInt();
		
		int employee_rating;
		System.out.println("enter rating:");
		employee_rating=sc.nextInt();
		
		
		if (employee_exp>=3 && employee_rating>=4 ) {
			
			System.out.println("exp:"+employee_exp);
			System.out.println("rate:"+employee_rating);
		
			System.out.println("eligible for hike");
		}
		else
		{
			System.out.println("not eligible for hike");
		}
	}

}
