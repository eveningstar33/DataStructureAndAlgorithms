package ds.linkedlists;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.setData(9);
		
		Node nodeB = new Node();
		nodeB.setData(1);
		
		Node nodeC = new Node();
		nodeC.setData(7);
		
		Node nodeD = new Node();
		nodeD.setData(5);
		
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeC));
	}
	
	public static int listLength(Node node) {
		int length = 0;
		Node currentNode = node;
		
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		
		return length;
	}
}
