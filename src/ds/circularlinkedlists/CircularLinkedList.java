package ds.circularlinkedlists;

public class CircularLinkedList {

	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			last = newNode;
		}
		
		newNode.setNext(first);
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			first = newNode;
		} else {
			last.setNext(newNode); 
			last = newNode;
		}
	}
	
	public Node deleteFirst() {
	    if (isEmpty()) {
	        System.out.println("The list is empty! You cannot delete a node from an empty list!"); 
	        return null;
	    } else {
			Node temp = first;
			
			if (first.getNext() == null) {
				last = null;
			}
			
			first = first.getNext();
			return temp;
	    }
	}
	
	public Node deleteLast() {
	    if (isEmpty()) {
	        System.out.println("The list is empty! You cannot delete a node from an empty list!"); 
	        return null;
	    } else {
	    	Node temp = last;
	    	
	    	if (first.getNext() == null) {
	    		first = null;
	    		last = null;
	    	} else {
		    	Node current = first;
		    	while (current.getNext() != last) {
		    		current = current.getNext();
		    	}
		    	current.setNext(null); 
		    	last = current;
	    	}
	    	return temp;
	    }
	}
	
	public void displayList() {
	    if (isEmpty()) {
	        System.out.println("The list is empty!"); 
	    } else {
			System.out.println("List (first --> last) ");
			Node currentNode = first;
			while (currentNode != null) {
				currentNode.displayNode();
				currentNode = currentNode.getNext();
			}
			System.out.println(); 
	    }
	}
}
