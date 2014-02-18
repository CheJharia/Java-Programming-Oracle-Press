import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FamousQuotes {
	private static ArrayList listOfFamousQuotes;
	private static ArrayList<String> listOfFamousQuotesTypeChecked;

	public static void main(String[] args) {
		FamousQuotes app = new FamousQuotes();
		System.out.println("Without using generics\n");
		app.buildList();
		app.printList();
		System.out.println();

		System.out.println("With generic classes\n");
		app.buildCheckedList();
		app.printCheckedList();

		System.out.println("\nNon-generics version of expurgate\n");
		System.out.println();
		String strAuthor = "Winston Churchill";
		System.out.println("After removing quotes by " + strAuthor);
		app.expurgate(listOfFamousQuotes, strAuthor);
		app.printList();

		System.out.println("\nGenerics version of expurgate\n");
		System.out.println();
		System.out.println("After removing quotes by " + strAuthor);
		app.expurgateCheckedList(listOfFamousQuotesTypeChecked, strAuthor);
		app.printCheckedList();
	}

	private void buildList() {
		listOfFamousQuotes = new ArrayList();
		listOfFamousQuotes
				.add("Where there is love there is life - Mahatma Gandhi");
		listOfFamousQuotes
				.add("A joke is a very serious thing - Winston Churchill");
		listOfFamousQuotes
				.add("In the end, everything is a gag - Charlie Chaplin");
		// listOfFamousQuotes.add(100); // add this to generate runtime error
	}

	private void buildCheckedList() {
		listOfFamousQuotesTypeChecked = new ArrayList<String>();
		listOfFamousQuotesTypeChecked
				.add("Where there is love there is life - Mahatma Gandhi");
		listOfFamousQuotesTypeChecked
				.add("A joke is a very serious thing - Winston Churchill");
		listOfFamousQuotesTypeChecked
				.add("In the end, everything is a gag - Charlie Chaplin");

	}

	private void printList() {
		Iterator listIterator = listOfFamousQuotes.iterator();
		while (listIterator.hasNext()) {
			String quote = (String) listIterator.next();
			System.out.println(quote);
		}
	}

	private void printCheckedList() {
		Iterator<String> listIterator = listOfFamousQuotesTypeChecked
				.iterator();
		while (listIterator.hasNext()) {
			String quote = listIterator.next();
			System.out.println(quote);
		}
	}

	private void expurgate(Collection c, String strAuthor) {
		for (Iterator i = c.iterator(); i.hasNext();) {
			if (((String) i.next()).contains(strAuthor)) {
				i.remove();
			}
		}
	}

	private void expurgateCheckedList(Collection<String> c, String strAuthor) {
		for (Iterator<String> i = c.iterator(); i.hasNext();) {
			if (i.next().contains(strAuthor)) {
				i.remove();
			}
		}
	}

}
