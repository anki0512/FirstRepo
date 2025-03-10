package com.app.geometry;

public class Point2D {
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
	}
	
	
	 public int calculateDistance(Point2D other) {
	        int dx = this.x - other.x;
	        int dy = this.y - other.y;
	        return (int) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

	 }
}
