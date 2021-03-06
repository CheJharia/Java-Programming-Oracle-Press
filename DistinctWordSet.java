import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DistinctWordSet {
	public static void main(String[] args) {
		int count = 0;
		Set<String> words = new HashSet<>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str;
		while (!(str = input.nextLine()).equals("")) {
			count++;
			words.add(str);
		}
		System.out.println(". . .");
		System.out.println("Total number of words entered:" + count);
		System.out.println("Distinct words: "+ words.size());
		System.out.println(". . .");
		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
