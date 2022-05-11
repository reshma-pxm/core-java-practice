package cond2;

import java.util.Scanner;

public class Donate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int age,weight;
System.out.println("Enter age: ");
age=s.nextInt();
System.out.println("enter weight:");
weight=s.nextInt();
if(age>=18 && weight >=40)
{
	
	System.out.println("Eligible to donate");
	}
else {
	System.out.println("not  Eligible to donate");
     }
 }
}
