package com.sunbeam;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
//		double accounumber ;
//		double balanceAtBigining;
//		double itemsCharged;
//		double creditsApplied;
//		double creditLimit;
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number ");
		double accountnumber = sc.nextDouble();
		System.out.println("enter balanceAtBigining");
		double balanceAtBigining = sc.nextDouble();
		System.out.println("Enter the itemsCharged");
		double itemsCharged = sc.nextDouble();
		System.out.println("Enter the creditsApplied");
		double creditsApplied = sc.nextDouble();
		System.out.println("Enter the creditLimit");
		double creditLimit = sc.nextDouble();
		
		
		  double newBalance = balanceAtBigining + itemsCharged - creditsApplied;
				
		System.out.println("newBalance =" +newBalance);
		
//     	The program should input all these facts as integers, calculate 
//		the new balance (= beginning balance+ charges – credits), 
//		display the new balance and determine whether the new balance 
//		exceeds the customer’s credit limit. For those customers whose 
//		credit limit is exceeded, the program should display 
//		the message "Credit limit exceeded".
		
		if( newBalance > creditLimit ) {
			System.out.println("Credit limit exceeded");
		}
	

	}

}




