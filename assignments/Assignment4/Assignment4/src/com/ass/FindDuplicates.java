package com.ass;

import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in arr1: ");
		int a = sc.nextInt();
		sc.nextLine();
		
		String[] arr1 = new String[a];
		String[] arr2 = new String[a];
		
		//Taking first array as input
		System.out.println("Enter the elements in arr1: ");
		for(int i=0; i<a ;i++) {
			arr1[i] = sc.nextLine();
		}
		
		//Taking size
		System.out.println("Enter the elements in arr2: ");
		int y = sc.nextInt();
		sc.nextLine();
		
		//Taking second array as input
		System.out.println("Enter the elements in arr2: ");
		for(int i=0; i<a; i++) {
			arr2[i] = sc.nextLine();
		}
	//Finding duplicates
     System.out.println("Duplicate values found in both arrays");
     for (int i1 = 0; i1 < a; i1++) {
    	 for (int j = 0; j < a; j++) {
    		 if (arr1[i1].equals(arr2[j])) {
    			 System.out.println(arr1[i1]);
		
		                }
		            }
		        }
     sc.close();
		}
	}

