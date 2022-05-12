package com.arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] array = {{2,3,4,5},{1,2,3,4}};
		
		for(int i=0;i<array.length;++i) {
			for(int j=0;j<array[i].length;++j) {
			
			System.out.println(array[i][j]);
		}

	}

}}
