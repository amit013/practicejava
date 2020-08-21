package javapractice;

public class ThreadByInterface implements Runnable{
	public void run() {
		System.out.println("The thread is running..");
	}
	
	public static void main(String[] args) {
		ThreadByInterface t=new ThreadByInterface();
		Thread t1=new Thread(t);
		t1.run();

	}

}
