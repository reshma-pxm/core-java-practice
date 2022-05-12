package com.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
	String[] cars= {"Benz","Swift","Duster","Enova","Scross"};
    int[] Model= {4,5,6,7,1};//array init
    System.out.println("car:" +cars[2]+"\nModel:"+Model[2]+" l:"+cars.length+"l: "+Model.length);//indexing
    cars[2]="BMW";//change array element
    System.out.println("---------Indexing--------");
    for(String display:cars) {
    	
    	System.out.println(display);//print array
    	
    }
    System.out.println("-----print array--------");
	}
	
}

