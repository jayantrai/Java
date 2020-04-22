
public class mythread extends Thread {
//	public void start() {
//		super.start();
//		System.out.println("start method");
//	}
	
	public void run()
	{
		
		for(int i = 0; i < 5; i++)
	{
		System.out.println("child thread");
		Thread.yield();
	}
	}
}
