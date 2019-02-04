package ds.linkedlists;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 9;
		
		Node nodeB = new Node();
		nodeB.data = 1;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeC));
	}
	
	public static int listLength(Node node) {
		int length = 0;
		Node currentNode = node;
		
		while (currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		
		return length;
	}
}
