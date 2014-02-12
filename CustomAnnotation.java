import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {
	private int taxID;

	@WorkInProgress
	@Task(description = "Implement tax computations", additionalNote = "This implementation is critical for the final launch", estimatedHours = 50, targetDate = "Jan 1, 2012")
	public static float ComputeTax(float amount, float rate) {
		return 0;
	}

}

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface WorkInProgress {
	String doSomething() default "\t Do what?";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Task {

	String description();

	String targetDate();

	int estimatedHours();

	String additionalNote();
}
