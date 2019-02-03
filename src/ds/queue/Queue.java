package ds.queue;

public class Queue {

	private int maxSize;  // initializes the set number of slots
	private long[] queArray;  // slots to maintain the data
	private int front; // index position for the element in the front
	private int rear;  // index position for the element at the back of the line
	private int nItems;  // counter to maintain the number of items in the queue
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[maxSize];
		front = 0;  // index position of the first slot of the array
		rear = -1;  // there is no item in the array yet to be considered as the last item
		nItems = 0; // there are no elements in the array yet
	}
	
	public void insert(int j) {
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public long remove() {  // remove item from the front of the queue
		long temp = queArray[front];
		front++;
		nItems--;
		return temp;
	}
	
	public void view() {
		System.out.print("[");
		for (int i = front; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
}
