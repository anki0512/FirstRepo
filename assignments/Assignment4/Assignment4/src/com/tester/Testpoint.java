
package com.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Testpoint {

	 //opening scanner
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter x1 co-ordinates");
			double x1 = sc.nextDouble();
			
			System.out.println("Enter y1 co-ordinates");
			double y1 = sc.nextDouble();
			
			System.out.println("Enter x2 co-ordinates");
			double x2 = sc.nextDouble();
			
			System.out.println("Enter y2 co-ordinates");
			double y2 = sc.nextDouble();
			
			Point2D p1 = new Point2D(x1, y1);
			Point2D p2 = new Point2D(x2, y2);
			
			//display details
			System.out.println("p1" +p1.getDetails());
			System.out.println("p2" +p2.getDetails());
			
			//checking the points are at same or diff.. position
			if(p1.isEqual(p2)) {
				System.out.println("Pointer are located at the same position");
			}
				else { 
				System.out.println("Pointer are located at different position");
				}
		//calculate distance	
	    double d = p1.calcDistance(p2);
		System.out.println("Distance between points :" + d);
			
		//closing the resource
			sc.close();
					
			}
}
