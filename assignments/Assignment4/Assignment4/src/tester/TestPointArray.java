package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Accept the number of points
		System.out.print("Enter the number of points: ");
		int numPoints =sc.nextInt();
		
		//create an array to store points
		Point2D[] points = new Point2D[numPoints];
		
		//Accept co-ordinates and store them in array
		for(int i=0; i<numPoints; i++) {
			System.out.println("Enter x & y co-ordinates ");
			points[i] = new Point2D(sc.nextDouble(), sc.nextDouble());
			
		}
		
		boolean exit = false;
		while(!exit) {
			//Display the menu
			System.out.println("\nMenu");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display all points");
			System.out.println("3. Calculate the distance between two points");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: 
				 // Display details of a specific point
                System.out.print("Enter index of the point: ");
                int index = sc.nextInt();
                if (index >= 0 && index < numPoints) {
                    System.out.println("Details: " + points[index].getDetails());
                } else {
                    System.out.println("Invalid index, please retry!");
                }
                break;

            case 2:
                // Display all points
                System.out.println("All points:");
                for (Point2D point : points) {
                    System.out.println(point.getDetails());
                }
                break;

            case 3:
                // Calculate distance between two points
                System.out.print("Enter index of first point: ");
                int i1 = sc.nextInt();
                System.out.print("Enter index of second point: ");
                int i2 = sc.nextInt();

                if (i1 >= 0 && i1 < numPoints && i2 >= 0 && i2 < numPoints) {
                    if (points[i1].isEqual(points[i2])) {
                        System.out.println("Points are at the same location. Distance: 0");
                    } else {
                        System.out.println("Distance: " + points[i1].calcDistance(points[i2]));
                    }
                } else {
                    System.out.println("Invalid indices, please try again!");
                }
                break;

            case 4:
                // Exit the program
                exit = true;
                System.out.println("Exiting..");
                break;

            default:
                System.out.println("Invalid choice! Please try again..");
        }
    }

		sc.close();
				
			}
		
		


		
	}

