public class WeekDaysList {

	public static void main(String[] args) {
		System.out.println("Days of week:");
		for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
			System.out.printf("%s ", day);
		}
		System.out.println();
	}
}

enum DaysOfTheWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	@Override
	public String toString() {
		// obtain the string representation of each constant
		// by calling super.toString()
		String s = super.toString();
		// only capitalize the first letter
		return s.substring(0, 1) + s.substring(1).toLowerCase();
	}
}
