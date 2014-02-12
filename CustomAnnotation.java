public class CustomAnnotation {

	@WorkInProgress
	@Task(description = "Implement tax computations", additionalNote = "This implementation is critical for the final launch", estimatedHours = 50, targetDate = "Jan 1, 2012")
	public static float ComputeTax(float amount, float rate) {
		return 0;
	}

}

@interface WorkInProgress {

}

@interface Task {

	String description();

	String targetDate();

	int estimatedHours();

	String additionalNote();
}
