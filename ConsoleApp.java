import java.io.Console;
import java.util.Arrays;
/*
 * A Console might not be available under some situations.
 * For example, if you execute the program statement System.console()
 * in a NetBeans IDE (or Eclipse), it returns a null object for the
 * Console because NetBeans provides its own window for the console output.
 */
public class ConsoleApp {
	private static final int MAX_LOGINS = 3;

	public static void main(String[] args) {
		ConsoleApp app = new ConsoleApp();
		if (app.login()) {
			System.out.println("Thanks for logging in!");
		} else {
			System.out.println("Login failed!");
		}
	}

	private boolean login() {
		Console console = System.console();
		boolean isAuthenticated = false;
		if (console != null) {
			int count = 0;
			do {
				char[] pwd = console.readPassword("[%s]", "Password:");
				isAuthenticated = authenticate(pwd);
				// character array is a primitive array
				// the idea is it can be deterministically cleared from 
				// memory as opposed to a String or other container.
				// Delete password from memory
				Arrays.fill(pwd, ' ');
				console.writer().write("\n");
			} while (!isAuthenticated && ++count < MAX_LOGINS);
		}else if (console == null) {
			System.out.println("Failed to return a console.");
		}
		return isAuthenticated;
	}

	private boolean authenticate(char[] pwd) {
		char[] secret = { 'a', 'b', 'c', 'd' };
		if (Arrays.equals(pwd, secret)) {

			Arrays.fill(pwd, ' ');
			System.out.println("Authenticated\n");
			return true;
		} else {
			System.out.println("Authentication failed\n");
		}
		return false;
	}

}
