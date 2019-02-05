package ds.doublylinkedlist;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public void DoublyLinkeList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			last = newNode;
		} else {
			first.setPrevious(newNode); 
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
			newNode.setPrevious(last); 
		}
		
		last = newNode;
	}
	
	public Node deleteFirst() {
	    if (isEmpty()) {
	        System.out.println("The list is empty! You cannot delete a node from an empty list!"); 
	        return null;
	    } else {
			Node temp = first;
			
			if (first.getNext() == null) {
				last = null;
			} else {
				first.getNext().setPrevious(null);
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
			
			if (last.getPrevious() == null) {
				first = null;
			} else {
				last.getPrevious().setNext(null);
			}
			last = last.getPrevious();
			return temp;
	    }
	}
	
	public boolean insertAfterKey(int key, int data) {
	    if (isEmpty()) {
	    	System.out.println("You cannot insert here. Node with value " + key + " doesn't exist."); 
	        return false;
	    } else {
			Node current = first;
			while (current.getData() != key) {
				current = current.getNext();
				if (current == null) {
			    	System.out.println("You cannot insert here. Node with value " + key + " doesn't exist.");
					return false;
				}
			}
			
			Node newNode = new Node();
			newNode.setData(data);
			
			if (current == last) {
				last = newNode;
			} else {
				current.getNext().setPrevious(newNode);
				newNode.setNext(current.getNext()); 
			}
			
			current.setNext(newNode);
			newNode.setPrevious(current); 
			
			return true;
	    }
	}
	
	public Node deleteKey(int key) {
	    if (isEmpty()) {
	        System.out.println("The list is empty! You cannot delete a node from an empty list!"); 
	        return null;
	    } else {
			Node current = first;
			while (current.getData() != key) {
				current = current.getNext();
				if (current == null) {
					return null;
				}
			}
			
			if (current == first) {
				first = current.getNext();
			} else {
				current.getPrevious().setNext(current.getNext()); 
			}
			
			if (current == last) {
				last = current.getPrevious();
			} else {
				current.getNext().setPrevious(current.getPrevious()); 
			}
			
//			Calling current.setNext(null) and current.setPrevious(null) is not necessary, 
//			since after calling deleteKey(int key), no Node of the list will contain a reference 
//			to the removed Node (referenced by current), so it doesn't matter what Nodes the 
//			removed Node is referring to.

			return current;
	    }
	}
	
	public void displayForward() {
	    if (isEmpty()) {
	        System.out.println("The list is empty!"); 
	    } else {
			System.out.println("List (first --> last): ");
			Node current = first;
			while (current != null) {
				current.displayNode();
				current = current.getNext();
			}
			System.out.println();
	    }
	}
	
	public void displayBackward() {
	    if (isEmpty()) {
	        System.out.println("The list is empty!"); 
	    } else {
			System.out.println("List (last --> first): ");
			Node current = last;
			while (current != null) {
				current.displayNode();
				current = current.getPrevious();
			}
			System.out.println();
	    }
	}
	
}
