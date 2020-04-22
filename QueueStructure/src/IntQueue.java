
public class IntQueue {
	private int [] q; // create an array
	private int size; //size of an array
	private int total; // total items in an array
	private int front; // points to the first item added
	private int rear; // points to the last item added
	
	
	public IntQueue() {
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[size];
		
	}
	
	public IntQueue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new int[this.size];
	}
	
	public boolean enqueue(int item) {
		if(isFull()) {
			return false;
		} else {
		total++;
		q[rear] = item;
		rear = (rear + 1) % size; // any other will be added to the next
		// takes care of index positioning which automatically moves to the first 
		return true;
		}
	}
	
	public int dequeue() {
		int item = q[front];
		total--;
		front = (front + 1) % size; // this points to the next array
		return item;
	}
	
	// to check if the queue array is full
	public boolean isFull() {
		if (size == total) {
			return true;
		} else {
			return false;
		}
	}
	
	public void showAll() {
		int f = front;
		if(total != 0) {
			for(int i = 0; i < q.length; i++) {
				System.out.println(" " + q[f]);
				f = (f + 1) % size;
			}
		}
	}
	
	
	
}
