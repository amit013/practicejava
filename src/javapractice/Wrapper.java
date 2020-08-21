package javapractice;

public class Wrapper {

	
	public static void main(String[] args) {
	@SuppressWarnings("deprecation")
	Integer obj=new Integer(10);
	int a=obj.intValue();
	int b=obj;
	System.out.println(b);
	}
}
