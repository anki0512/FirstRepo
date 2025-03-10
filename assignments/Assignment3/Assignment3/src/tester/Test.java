package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coordinate for point p1(x1,y1):");
		int x1 = sc.nextInt();
		int y1 =sc.nextInt();
		Point2D p1 = new Point2D(x1, y1);
		
		
		System.out.println("Enter the coordinate for point p2(x1,y1):");
		int x2 = sc.nextInt();
		int y2 =sc.nextInt();
		Point2D p2 = new Point2D(x2, y2);
		
		System.out.println("Details of p1 = " +p1.getDetails());
		System.out.println("Details of p2 = " +p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("p1 and p2 are located at same location");
		}
		else {
			System.out.println("p1 and p2 are located at diffrent location");
			int distance = p1.calculateDistance(p2);
			System.out.println("The Distance bitween two coordinates are " + distance);
		}
		sc.close();

	}

}
