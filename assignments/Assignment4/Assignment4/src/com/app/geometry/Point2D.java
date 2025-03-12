
package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	

//parameterized constructor
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

//return details
	public String getDetails() {
        return "(" + x + ", " + y + ")";
    }
	//checking if current is equal to other point
	public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }
    
//calculating the distance using formula
	public double calcDistance(Point2D other) {
	
		double xD = this.x - other.x;
		double yD = this.y - other.y;
		 return Math.sqrt(Math.pow(xD, 2) + Math.pow(yD, 2));
		
	}

}

