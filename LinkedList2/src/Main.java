
public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(1);
		list.insert(20);
		list.insert(31);
		list.insert(11);
		
		list.insertAtStart(51);
		
		list.insertAt(2, 63);
		
		list.deleteAt(2);
		list.show();
	}

}
