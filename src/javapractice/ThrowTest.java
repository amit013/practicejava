package javapractice;

public class ThrowTest {
	
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("age must be above 18");
		}
		else 
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		validate(16);
		System.out.println("Rest of the code..");
	}

}
