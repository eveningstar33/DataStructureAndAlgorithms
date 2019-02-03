package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		theQueue.insert(1000);
		theQueue.insert(10000);
		theQueue.insert(14);
		theQueue.insert(99);
		theQueue.insert(76);
		theQueue.view();
		theQueue.remove();
		theQueue.view();
		theQueue.remove();
		theQueue.view();
	}
}
