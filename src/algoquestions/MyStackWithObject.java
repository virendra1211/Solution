package algoquestions;

interface Stackable<T> {
	void push(T value);

	T peek();

	T pop();

	boolean isEmpty();

	int size();

	int search(Object o);
}

class Stack<T> implements Stackable<T> {
	// previous is a reference to the item that is located below the current
	// instance in the stack order (the underlying item).
	private Stack<T> previous;
	private T value;

	Stack() {
	}

	Stack(T value) {
		this.value = value;
	}

	Stack(Stack<T> previous, T value) {
		this.previous = previous;
		this.value = value;
	}

	@Override
	public void push(T value) {
		this.previous = new Stack<T>(this.previous, value);
		this.value = value;
	}

	@Override
	public T peek() {
		return this.value;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty !!");
		}
		T top = this.value;
		this.value = this.previous.value;
		this.previous = this.previous.previous;
		return top;

	}

	@Override
	public boolean isEmpty() {
		return this.previous == null;
	}

	@Override
	public int size() {
		return this.isEmpty() ? 0 : 1 + this.previous.size();
	}

	@Override
	public int search(Object o) {
		int count = 1;
		for (Stack<T> stack = this; !stack.isEmpty(); stack = stack.previous) {
			if (stack.value.equals(o))
				return count;
			count++;
		}
		return -1;
	}

}

public class MyStackWithObject {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack.isEmpty());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		System.out.println("search 5 "+stack.search(5));
	}
}




