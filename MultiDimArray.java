public class MultiDimArray {

	public static void main(String[] args) {
		final int MAX_STUDENTS = 50, MAX_SUBJECTS = 3;
		int[][] marks = new int[MAX_STUDENTS][MAX_SUBJECTS];
		// generate data into the marks
		for (int studentID = 0; studentID < MAX_STUDENTS; studentID++) {
			for (int subjectID = 0; subjectID < MAX_SUBJECTS; subjectID++) {
				marks[studentID][subjectID] = (int) (Math.random() * 20);
			}
		}
		// print marks
		for (int studentID = 0; studentID < MAX_STUDENTS; studentID++) {
			System.out.println("Student #" + studentID);
			for (int subjectID = 0; subjectID < MAX_SUBJECTS; subjectID++) {
				System.out.println("\tSubject # " + subjectID + " : "
						+ marks[studentID][subjectID]);
			}
		}
	}

}
