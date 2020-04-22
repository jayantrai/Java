
public class threaddemo extends Thread {

	public static void main(String[] args) {
	

		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(7);
		mythread t = new mythread();
		t.start();
		for(int i = 0; i < 5; i++)
		{
			System.out.println("main thread");
		}
//		System.out.println(t.getPriority());
//		System.out.println(t.getName());
//		Thread.currentThread().setName("Jayant Rai");
//		System.out.println(Thread.currentThread().getName());
//				
		
	}

}
