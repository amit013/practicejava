package javapractice;

public class FinallyBlock {

	public static void main(String[] args) {
		try{
			int a=20/0;
			System.out.println(a);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block executed");
		}
		System.out.println("rest of the code..");
	}

}
