import java.awt.Color;

public class Ball {
	private static int count = 0;
	private static int redBallCount = 0;
	private static int greenBallCount = 0;
	// by declaring adding public modifier to static
	// we have a global variable because it can be
	// modified by code outside the class definition
	// public static int count = 0;

	// private static int radius = 0;
	private static int radius = initClassVariables();
	private Color defaultColor;

	// // using static constructor/initialiser
	// static{
	// radius = 0;
	// }

	private static int initClassVariables() {
		// some computations to determine radius
		int radius = 5;
		return radius;
	}

	public static int getRedBallCount() {
		return redBallCount;
	}

	public static int getGreenBallCount() {
		return greenBallCount;
	}

	public static int getRadius() {
		return radius;
	}

	public static void setRadius(int radius) {
		Ball.radius = radius;
	}

	public static int getCount() {
		return count;
	}

	public Ball() {
		count++;
	}

	public Ball(Color color) {
		count++;
		if (color == Color.RED) {
			this.defaultColor = Color.RED;
			redBallCount++;
		} else {
			this.defaultColor = Color.GREEN;
			greenBallCount++;
		}
	}

	public void setVelocity(double v) {
		String strColor = null;
		if (defaultColor == Color.RED) {
			strColor = "Red";
		} else {
			strColor = "Green";
		}
		System.out.printf("Ball #%d:%-10s velocity set to %.02f%n", count,
				strColor, v);
	}

}

class RedBall extends Ball {
	public RedBall() {
	}
}
