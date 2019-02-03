package ds.stak;

public class Stack {

	private int maxSize;  // it'll store the size of the stack
	private char[] stackArray;  // slots to maintain the data
	private int top;  // index position for the element at the top
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char j) {
		if (isFull()) {
			System.out.println("Cannot added the " + j + " because the stack is already full!");
		} else {
			top++;
			stackArray[top] = j;
		}
	}
	
	public char pop() {
		if (isEmpty()) {
			System.out.println("the stack is empty");
			return '0';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}
