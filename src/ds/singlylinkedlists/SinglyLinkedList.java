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
		newNode.setData(data);
		newNode.setNext(first); 
		first = newNode;
	}
	
	public Node deleteFirst() {
	    if (isEmpty()) {
	        System.out.println("The list is empty! You cannot delete a node from an empty list!"); 
	        return null;
	    } else {
			Node temp = first;
			first = first.getNext();
			return temp;
	    }
	}
	
	public void displayList() {
	    if (isEmpty()) {
	        System.out.println("The list is empty!"); 
	    } else {
			System.out.println("List (first --> last): ");
			Node currentNode = first;
			while (currentNode != null) {
				currentNode.displayNode();
				currentNode = currentNode.getNext();
			}
	    }
	}
	
	public void insertLast(int data) {
		Node currentNode = first;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		Node newNode = new Node();
		newNode.setData(data);
		currentNode.setNext(newNode);
	}
}
