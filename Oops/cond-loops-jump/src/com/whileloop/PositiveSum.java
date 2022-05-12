package com.whileloop;

import java.util.Scanner;

public class PositiveSum {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num =sc.nextInt();
		int sum=0;
		
	do {
		
		sum +=num;//68+70
		System.out.println("Enter the number:");
        num = sc.nextInt();
	
	System.out.println("sum of positive num are "+sum);
	}while(num>=0);	
		
	}
	

	}


