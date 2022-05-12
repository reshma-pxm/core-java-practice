package com.whileloop;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number: ");
        int n=sc.nextInt(); 
        int i=1;
        System.out.println("The multiplication table of "+n+" is: ");
        do {
        	System.out.println(n +" * "+i +" = "+(n*i));//3*1=3
        	i++;
        }
	
	while(i<=10);
}
}
