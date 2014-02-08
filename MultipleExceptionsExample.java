import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.sun.org.apache.xerces.internal.util.URI.MalformedURIException;

public class MultipleExceptionsExample {

	public static void main(String[] args) {
		String urlStr = null;
		while (true) {
			try {
				System.out.println("Enter url: ");
				// read from standard input
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in));
				// read a line of input from the keyboard until the ENTER key is
				// pressed
				urlStr = reader.readLine();

				if (urlStr.length() == 0) {
					System.out.println("No url specified: ");
					continue;
				}
				System.out.println("Opening " + urlStr);

				URL url = new URL(urlStr);

				reader = new BufferedReader((new InputStreamReader(
						url.openStream())));

				System.out.println(reader.readLine());
				reader.close();
			} catch (MalformedURIException e) {
				System.out.println("Invalid URL " + urlStr + ":"
						+ e.getMessage());
			} catch (IOException e) {
				System.out.println("Unable to execute " + urlStr + ":"
						+ e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
