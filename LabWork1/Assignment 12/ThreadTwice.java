
public class ThreadTwice extends Thread {

	@Override
	public void run()
	{
		System.out.println("Thread started running...");
	}
	public static void main(String[] args)
	{
		ThreadTwice t = new ThreadTwice();
		t.start();
		t.start();
	}
}
