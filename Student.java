import java.io.Serializable;

public class Student implements Serializable {
	private String firstName;
	private String lastName;
	private int id;

	public Student(int id,String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String toString() {
		return ("ID:" + id + " " + firstName + " " + lastName);
	}

}
