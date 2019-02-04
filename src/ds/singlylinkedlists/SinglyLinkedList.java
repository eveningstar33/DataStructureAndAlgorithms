package ds.singlylinkedlists;

public class SinglyLinkedList {

	private Node first;
	
	// We add a constructor for the sake of completeness
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	// insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		Node currentNode = first;
		while (currentNode != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
	}
	
	public void insertLast(int data) {
		Node currentNode = first;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		currentNode.next = newNode;
	}
}
