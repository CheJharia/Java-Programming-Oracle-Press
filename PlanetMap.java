import java.util.HashMap;
import java.util.Scanner;

public class PlanetMap {
	public static void main(String[] args) {
		// we use Integer wrapper class because
		// the parameter expects a subclass of Object, and 
		// not a primitive type
		HashMap<Integer, String> mapOfPlanets = new HashMap<Integer, String>();
		mapOfPlanets.put(1, "Mercury");
		mapOfPlanets.put(2, "Venus");
		mapOfPlanets.put(3, "Earth");
		mapOfPlanets.put(4, "Mars");
		mapOfPlanets.put(5, "Jupiter");
		mapOfPlanets.put(6, "Saturn");
		mapOfPlanets.put(7, "Uranus");
		mapOfPlanets.put(8, "Neptune");

		while (true) {
			System.out.println("Enter the desired position: ");
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			if (mapOfPlanets.containsKey(i)) {
				System.out.printf("Solar system position %d is taken by %s%n",
						i, mapOfPlanets.get(i));
			} else {
				System.out.println("Number must be between 1 and 8");
			}

		}

	}

}
