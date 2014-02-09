import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializationAPp {

	public static void main(String[] args) {
		ObjectOutputStream objectWriter = null;
		ObjectInputStream objectReader = null;
		try {
			objectWriter = new ObjectOutputStream(new FileOutputStream(
					"student.dat"));
			objectWriter.writeObject(new Student(1, "A", "a"));
			objectWriter.writeObject(new Student(2, "B", "b"));
			objectWriter.writeObject(new Student(3, "C", "c"));
			objectWriter.writeObject(new Student(4, "D", "d"));

			System.out.println("Printing list of students in the database:");
			objectReader = new ObjectInputStream(new FileInputStream(
					"student.dat"));
			for (int i = 0; i < 4; i++) {
				System.out.println(objectReader.readObject());
			}
		} catch (Exception e) {
		} finally {
			try {
				objectReader.close();
				objectWriter.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
