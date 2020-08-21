package javapractice;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("going to divide");
				int a=20/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[5]=1;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("other statement");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("normal flow..");
	}

}
