
public class ThreadB extends Thread {
	int total = 0;
	
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread");
		
		for(int i = 1; i < 10; i++)
		{
			total = total + i;
		}
		System.out.println("child thread notifies");
		this.notify();
	}
	}
}
