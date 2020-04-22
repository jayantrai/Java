import java.util.NoSuchElementException;

public class DoublyLinkedList {
	// define head, tail, length
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode {
		private int data;
		private ListNode next;
		private ListNode prev;
		
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	// is Empty
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int length() {
		return length;
	}
	
	// insert
	
	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			
			newNode.prev = tail;
		}
		tail = newNode;
		length++;
	}
	
	public void displayForward() {
		
		if(head == null) {
			return;
		} else {
			ListNode temp = head;
			while(temp != null) {
				System.out.println(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println("null");
			
		}
		
	}
	
	public void displayBackward() {
		if (tail == null) {
			return;
		} else {
			ListNode temp = tail;
			while(temp != null) {
				System.out.println(temp.data + "-->");
				temp = temp.prev;
			}
			System.out.println("null");
		}
	}
	public ListNode deleteFromLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if(head == tail) { // this means that if there is one node left
			head = null; //breaks the link
		} else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
		length--;
		return temp;
	}
	
}
