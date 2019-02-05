package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(22);
		myList.insertFirst(47);
		myList.insertFirst(31);
		myList.insertLast(10);
		myList.insertLast(99);
		myList.insertLast(55);
		myList.displayForward();
		myList.displayBackward();
		myList.insertAfterKey(22, 19);
		myList.displayForward();
		myList.deleteFirst();
		myList.deleteLast();
		myList.deleteKey(10);
		myList.displayForward();
	}
}
