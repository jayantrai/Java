
public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Jayant");
		MyThread t2 = new MyThread(d, "Kalpana");
		t1.start();
		t2.start();

	}

}
