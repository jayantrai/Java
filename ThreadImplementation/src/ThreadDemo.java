
public class ThreadDemo {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		t2.start();
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("main thread");
		}

	}

}
