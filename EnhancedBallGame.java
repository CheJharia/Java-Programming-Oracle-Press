import java.awt.Color;

public class EnhancedBallGame {

	public static void main(String[] args) {
		int numberOfBalls = (int) (Math.random() * 20);
		int radius = (int) (Math.random() * 20 + 1);
		// setRadious is a static method of the class Ball
		// it sets the Ball class field radius
		Ball.setRadius(radius);
		System.out.printf("Creating %d balls of radius %d%n", numberOfBalls,
				Ball.getRadius());
		for (int i = 0; i < numberOfBalls; i++) {
			int number = (int) (Math.random() * 2);
			if (number == 0) {
				new Ball(Color.RED).setVelocity(Math.random() * 10);
			} else {
				new Ball(Color.GREEN).setVelocity(Math.random() * 10);
			}
		}
		System.out.println("Number of red balls created: "
				+ Ball.getRedBallCount());
		System.out.println("Number of green balls created: "
				+ Ball.getGreenBallCount());
	}

}
