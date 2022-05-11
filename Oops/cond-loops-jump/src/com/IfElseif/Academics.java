package com.IfElseif;

import java.util.Scanner;

public class Academics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scan>>initialize>>print>>method init
		int marks;
		System.out.println("enter student marks:");
		marks=sc.nextInt();
		System.out.println("student marks:"+marks);
		
		
		if (marks<=100 && marks>=95) {
			
			System.out.println("distinction");
		}
			else if (marks<=94 && marks>=85) {
				System.out.println("first class");
			}
			else if (marks<=84 && marks>=75) {
				System.out.println("second class");
			}
			else if (marks<=74 && marks>=65) {
				System.out.println("third class");
			}
			else if (marks<=64 && marks>=55) {
				System.out.println("pass");
			}
			else 
			{
				System.out.println("fail");
			}
		
		}

	}


