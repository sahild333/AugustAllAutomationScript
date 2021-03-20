package javaBasics;

public class TwoDArrayConcept {

	public static void main(String[] args) {
		// One Dimensional Array
//		String[] a = new String[4];
//		a[0]= "";
//		a[1]= "";
//		a[2]= "";
//		a[3]= "";
//
//		int b[] = {10,20,30,50} ;
//		System.out.println(b.length);
//		
//		//2 dimensional Array
//		//use 2[][]
//		//first is number of rows, second is number of columns
//		//ex. String [][] a = new String [rows][columns];
//		
//		int[][] scores = new int[4][2]; //old way/helps set restrictions in amount of rows  //still indexing for rows and columns (count starts from 0,1,2,3)
//		//1st row
//		scores[0][0] = 10;
//		scores[0][1] = 20;
//		//2nd row
//		scores[1][0] = 100;
//		scores[1][1] = 200;
//		//3rd row
//		scores[2][0] = 1000;
//		scores[2][1] = 2000;
//		//4th row
//		scores[3][0] = 10000;
//		scores[3][1] = 20000;
//		
//		int[][] scores1 = {{10,20},{100,200},{1000,2000},{10000,20000}}; //no length restrictions
//		
//		System.out.println("Number of rows in scores array: "+scores.length); //length gives you number of row count
//		System.out.println("Number of rows in scores1 array: "+scores1.length);
//		
//		//in order to get length of columns, count length of a single row
//		System.out.println("Number of columns in scores array: "+scores[0].length); 
//		System.out.println("Number of columns in scores1 array: "+scores1[3].length); 
//		
//		for(int i=0; i<scores.length; i++) { //first for loop is traversing into rows
//			for (int j=0; j<scores[i].length; j++) { // second for loop is traversing into columns
//				System.out.println(scores[i][j]);
//				
//			}
//		}
//
//		
//		for(int i=0; i<scores1.length; i++) {
//			for(int j=0; j<scores1[i].length; j++) {
//				System.out.print(scores1[i][j]+" "); //no println
//			}
//		}
//
//		String custInfo[][] = {{"john","john@gmail.com", "5165453662"},{"michael","michael@gmail.com","5162365823"}};
//		System.out.println(custInfo.length);
//		System.out.println(custInfo[1].length);
//		
//		for (int i=0; i<custInfo.length;i++) {
//			for (int j=0; j<custInfo[i].length; j++) {
//				System.out.println(custInfo[i][j]+" ");
//			}
//			
		String arrayCustomerInfo[][]= {{"sal","no@gmail.com","5167476636"},{"Sal", "mike@gmail.com", "5163442552"},{"Sam", "samsemail@gmail.com", "5166541111"}};
//		System.out.println("Number of rows:"+arrayCustomerInfo.length );
//		System.out.println("Number of columns:"+ arrayCustomerInfo[0].length);
//			 
//		for (int h=0; h<arrayCustomerInfo.length;h++) {
//			for (int g=0;g<arrayCustomerInfo[h].length;h++) {
//			}
//			int h=0;
//			while (h<arrayCustomerInfo.length) {
//			int j=0;
//			while (j<arrayCustomerInfo[h].length) {
//				System.out.println(arrayCustomerInfo[h][j]);
//				h++;}
//				j++;
//			 }
//						
//			int i=0;
//			while (i<=100) {
//				System.out.println(i);
//				i=i+2;
//			}
			
		}
	}
	//Assignment improvement:
//		1. input username/password = create 2-D array
//		2. Database username/password = create 2-D array

