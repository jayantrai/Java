
public class LinkedList {
	// here we will first define the head
	Node head;
	
	// after that create an insert method
	
	public void insert(int data) {
		// we have to create a new node every time
		Node node = new Node();
		//get the data
		node.data = data;
		// check whether this is the first data
		if(head == null) {
			head = node;
		}
		else {
			// if it is not the first object create a node and make it 
			// a head
			Node n = head;
			// now we need to know which is the last element since we are 
			// inserting at the end 
			// in order to do that we need to travel to the last location
			// this can be done by checking not null
			while(n.next!=null) {
				//if it is not null, jump to the next node
				n = n.next;
				
			}
			// once we get null change the value
			n.next = node;
		}
		
		
	}
	// to show all the values
	public void show() {
		// in order to show the values 
		Node n = head;
		
		while(n != null) {
			System.out.println(n.data);
			
			// shift to the next node
			n = n.next;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		
		node.next = head;
		head = node;
	}
	
	// insert at any location
	public void insertAt(int index, int data ) {
		Node node = new Node();
		node.data = data;
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			
			// the new node is the head of the next node
			node.next = n.next;
			n.next = node;
		}
		
		
	}
	
	public void deleteAt(int index) {
		// to delete from the first
		if(index==0) {
			//change thte head location
			head = head.next;
		} else {
			// if it is not a first location, we need to traverse
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			
		}
			n1 = n.next;
			n.next = n1.next;
//			System.out.println("n1 " + n1.data);
			n1 = null;
	}
	
	
	}
}
