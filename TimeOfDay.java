public class TimeOfDay {

	private int hour, mins;

	public TimeOfDay(int hour, int mins) {
		this.hour = hour;
		this.mins = mins;
	}

	// constructor to make a copy of an instance of TimeOfDay
	public TimeOfDay(TimeOfDay other) {
		this(other.hour, other.mins);
	}
	
	@Override
	public String toString() {
		return (this.hour + ":" + this.mins);
	}

	public static void main(String[] args) {
		TimeOfDay currentTime = new TimeOfDay(00, 12);
		TimeOfDay copyOfCurrentTime = new TimeOfDay(currentTime);
		System.out.println("Original:" + currentTime);
		System.out.println("Copy:" + copyOfCurrentTime);
	}

}
