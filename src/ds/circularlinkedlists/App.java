package ds.circularlinkedlists;

public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(74);
		myList.insertLast(88888);
		
		myList.displayList();
	}
}
