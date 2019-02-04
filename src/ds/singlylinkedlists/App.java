package ds.singlylinkedlists;

public class App {

	public static void main(String[] args) {

		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(74);
		myList.insertLast(88888);
		
		myList.displayList();
	}

}
