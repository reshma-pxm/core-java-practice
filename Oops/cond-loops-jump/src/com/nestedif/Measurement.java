package com.nestedif;

import java.util.Scanner;

public class Measurement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//scan>>initialize>>print>>method init
		float height;
		int weight;
		System.out.println("enter student height:");
		height=sc.nextFloat();
		
		System.out.println("enter student weight:");
		weight=sc.nextInt();
		
		if(height >=5.5) {
			
			if(weight >=50) {
				System.out.println("student measure:"+height);
				System.out.println("student measure:"+weight);
				System.out.println("eligible for longjump");
			}
			else {
				System.out.println("not eligible for longjump");
			}
		}

	}

}
