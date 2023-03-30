package algoquestions;

public class MyStackByArray {

	public static void main(String[] args) {
		Stack1 stack = new Stack1(5);
		System.out.println("before "+stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("after "+stack.isEmpty());
		System.out.println("after "+stack.isFull());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}

}
class Stack1{
	private int maxSize;
	private int myStack[];
	private int top;
	
	
	Stack1(int size){
		myStack= new int[size];
		this.maxSize=size;
		this.top=-1;
	}
	public int size() {
		return top+1;
	}
	// utility method
	public boolean isEmpty() {
		return top  == -1;
	}
	public boolean isFull() {
		return maxSize-1 == top;
	}
	
	public void push(int data) {
		if(isFull()) {
			throw new RuntimeException("Size is already exahasted !!");
		}
		myStack[++top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Bucket is already empty, can't push an Item !!");
		}
		return myStack[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Bucket is already empty, can't push an Item !!");
		}
		return myStack[top];
	}

}