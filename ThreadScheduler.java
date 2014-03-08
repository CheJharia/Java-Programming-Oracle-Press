import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ThreadScheduler {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 10));
		}
		PriorityQueue<Integer> threadQueue = new PriorityQueue<>();
		threadQueue.addAll(list);
		System.out.println("Waiting threads ...");
		int c = 0;
		for (Integer thread : threadQueue) {
			c++;
			System.out.print(thread + ",");
			if (c % 20 == 0) {
				System.out.println();
			}
		}
		System.out.println("\nDeploying threads...");
		c = 0;
		while (!threadQueue.isEmpty()) {
			c++;
			System.out.print(threadQueue.remove() + ",");
			if (c % 20 == 0) {
				System.out.println();
			}
		}
	}

}
