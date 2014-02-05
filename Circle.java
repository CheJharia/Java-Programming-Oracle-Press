public class Circle {
	private final Point CENTER_POINT = new Point(0, 0);

	public void drawCircle() {

		// CENTER_POINT is a reference to an object(Point())
		// however, its content, which is the object is not declared constant
		// therefore we can always modify the object content by calling the mutator
		CENTER_POINT.setX(10);
		CENTER_POINT.setY(10);
		CENTER_POINT.setX(120);
		CENTER_POINT.setY(110);

		// illegal assignment
		// CENTER_POINT is a reference to an object(Point())
		// so we can't change its reference to a new object
		// CENTER_POINT = new Point(50, 50);
	}
}
