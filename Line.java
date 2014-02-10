import java.awt.Color;
import java.io.Serializable;

public class Line implements Serializable {
	private ColorPoint startPoint = new ColorPoint(0, 0, Color.red);
	private ColorPoint endPoint = new ColorPoint(0, 0, Color.blue);

	public String toString() {
		return "StartPoint=" + startPoint + "\nEndPoint=" + endPoint;
	}
}
