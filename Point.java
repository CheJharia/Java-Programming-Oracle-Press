import java.awt.Color;
import java.io.Serializable;

class Point implements Serializable {
	protected int x, y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String position() {
		if (this.x == 0 && this.y == 0) {
			return "Origin";
		} else if (this.x > 0 && this.y > 0) {
			return "First Quadrant";
		} else if (this.x < 0 && this.y > 0) {
			return "Second Quadrant";
		} else if (this.x < 0 && this.y < 0) {
			return "Third Quadrant";
		} else
			return "Fourth Quadrant";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getDistance() {
		return (Math.sqrt(this.x * this.x + this.y * this.y));
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}

	public static void main(String[] args) {
		Point[] points = new Point[10];
		for (int i = 0; i < points.length; i++) {
			// need to call constructor for each block
			points[i] = new Point((int) (Math.random() * 20),
					(int) (Math.random() * 20));
			System.out.print(points[i]);
			System.out.println(" distance from origin:"
					+ (int) points[i].getDistance());
		}
	}
}

class ColorPoint extends Point implements Serializable {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Point{" + "x=" + x + " y=" + y + "}" + " ColorPoint{"
				+ "color=" + color + "}";
	}
}
