// create array stack, top for index, size of the array
public class PersonStack {
	private Person [] stack;
	private int top;
	private int size;
	
	public PersonStack() {
		top = -1;
		size = 50;
		// in the stack which is an array, person objects are stored.
		stack = new Person[50]; // create new person stack. 
	}
	
	public PersonStack(int size) {
		top = -1;
		this.size = size;
		// the array stack is equal to the size of an array
		stack = new Person[this.size];
	}
	
	// push 
	public boolean push(Person item) {
		if(!isFull()) {
			top++; // when we insert, the index is increased
			stack[top] = item; // put the item in the top stack
			return true;
		} else {
			return false;
		}

	}
	
	// pop
	public Person pop() {
		// when we remove, the top index of the stack is removed
		return stack[top--];
	}
	
	
	// isEmpty
	
	public boolean isEmpty() {
		// target top index 
		return (top == -1);
	}
	
	// isFull condition
	public boolean isFull() {
		return (top == stack.length - 1);
	}
}
