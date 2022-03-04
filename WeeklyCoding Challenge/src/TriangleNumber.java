package com.jaydan;



	public class TriangleNumber { 
		public static void main(String[] args) {
			
			int i = 1;
	        int x = 2;
	        boolean found = false;
	        while (!found) {
	            if (triangle(i) > 500) {
	                System.out.println(i);
	                found = true;
	            }
	            else {
	                i +=x;
	                x++;
	            }
	        }


		}
		public static int triangle (int j) {
			
			 int counter = 0;
		        for (int i = 1; i*i <= j; i++) {
		            if (j % i == 0) counter++;
		        }
		        return counter;
		    }
	}