package javapractice;

public class ThreadByExtendClass extends Thread {
	public void run() {
		System.out.println("Thread is running..");
	}
	public static void main(String[] args) {
		ThreadByExtendClass t=new ThreadByExtendClass();
		t.run();

	}

}
