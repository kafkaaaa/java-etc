package q1;

class Circle {
	private int x;
	private int y;
	private int radius;
	
	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ")¹ÝÁö¸§" + radius;
	}
	
	public boolean equals(Object ob) {
		Circle c = (Circle)ob;
		if (x == c.x && y == c.y)
			return true;
		else
			return false;
	}
}
