
public class PersonStack {
	private Person [] stack;
	private int total;
	private int size;
	private int rear;
	private int front;
	
	public PersonStack() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		stack = new Person[size];
	}
	
	public PersonStack(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		stack = new Person[this.size];
	}
	
	public boolean enqueue(Person item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			stack[total] = item;
			rear = (rear + 1) % size;
			return true;
		}
	}
	
	public Person dequeue() {
		Person item = stack[front];
		total--;
		front = (front + 1) % size;
		return item;
	}
	
	
	public boolean isFull() {
		if (size == total) {
			return true;
		} else {
			return false;
		}
	}

	public void showAll() {
		int i = front;
		if(total != 0) {
			for(int j = 1; j <= total; j++) {
				System.out.println(stack[j].toString());
				i = (i + 1) % size;
			}
			
		}
		
	}
	
		
		
	}

