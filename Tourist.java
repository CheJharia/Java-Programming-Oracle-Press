public class Tourist {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Tourist person = new Tourist();
			try {
				person.takeTour();
				// if an exception is thrown from previous line, this next
				// instruction is not executed
				System.out.printf("Tourist %d say: This is cool%n", i + 1);
			} catch (TooHotException hx) {
				System.out.printf("Tourist %d say: %s%n", i + 1,
						hx.getMessage());
				continue;
			} catch (TooColdException hx) {
				System.out.printf("Tourist %d say: %s%n", i + 1,
						hx.getMessage());
				continue;
			} finally {
				System.out.println();
			}

		}
	}

	void takeTour() throws TooHotException, TooColdException {
		int temperature = (int) (Math.random() * 100);
		System.out.println("temperature = " + temperature);
		if (temperature > 60) {
			throw new TooHotException("Too hot here");
		} else if (temperature < 10) {
			throw new TooColdException("Too cold here");
		}
	}

}
