
public class Main {

	public static void main(String[] args) {
//		IntQueue q = new IntQueue();
//		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(5);
//		q.enqueue(6);
//		q.enqueue(7);
//		
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		
//		q.showAll();
		
		PersonStack q = new PersonStack();
		
		
		
		q.enqueue(new Person("Jayant", "123"));
		q.enqueue(new Person("Ali", "345"));
		
		
		q.showAll();
	}
}
