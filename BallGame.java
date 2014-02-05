public class BallGame {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			// the randomizer generates a random number in the range 0 to 10.

			int number = (int) (Math.random() * 10);
			if (number == 5) {
				new Ball();
			}
		}
		System.out.println(Ball.getCount());

		// calling subclass of Ball, RedBall
		for (int i = 0; i < 100; i++) {
			// the randomizer generates a random number in the range 0 to 10.

			int number = (int) (Math.random() * 10);
			if (number == 5) {
				new RedBall();
			}
		}
		// we confirm that all static fields are also inherited by the
		// subclasses
		System.out.println(Ball.getCount());

	}
}
