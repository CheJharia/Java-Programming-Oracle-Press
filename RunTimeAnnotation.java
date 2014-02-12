import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class RunTimeAnnotation {

	@WorkInProgress
	@Task(description = "Implement tax computations", additionalNote = "This implementation is critical for the final launch", estimatedHours = 50, targetDate = "Jan 1, 2012")
	public static float ComputeTax(float amount, float rate) {
		return 0;
	}

	public static void main(String[] args) {
		RunTimeAnnotation obj = new RunTimeAnnotation();
		Class cls = obj.getClass();
		WorkInProgress annotation = (WorkInProgress) cls
				.getAnnotation(WorkInProgress.class);
		System.out.println("Class " + cls.getName());
		if (cls.isAnnotationPresent(WorkInProgress.class)) {
			System.out.println("\tThis class is not fully implemented");
		}
		System.out.println("\nList of methods:");
		Method[] methods = cls.getMethods();
		for (java.lang.reflect.Method method : methods) {
			System.out.println(method.getName());
			if (method.isAnnotationPresent(WorkInProgress.class)) {
				System.out.println("\tThis method is not fully implemented");
			}
			if (method.isAnnotationPresent(Task.class)) {
				Task annotationTask = (Task) method.getAnnotation(Task.class);
				System.out.printf("\tWhat TODO: "
						+ annotationTask.description() + "%n\tTarget date: "
						+ annotationTask.targetDate() + "%n\tEstimated hours: "
						+ annotationTask.estimatedHours() + "%n\tNote: "
						+ annotationTask.additionalNote() + "%n");
			}
		}

	}
}

// 
//@Retention(RetentionPolicy.RUNTIME)
//@interface WorkInProgress {
//}
//
//@Retention(RetentionPolicy.RUNTIME)
//@interface Task {
//	String description();
//
//	String targetDate() default "Jan 1, 2012";
//
//	int estimatedHours();
//
//	String additionalNote();
//}
