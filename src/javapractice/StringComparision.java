package javapractice;

public class StringComparision {

	public static void main(String[] args) {
		String s1="Amit";
		String s2="Amit";
		String s3="AMIT";
		String s4= new String("Amit");
		String s5="Kumar";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println("\n");
		
		System.out.println(s1==s2);
		System.out.println(s1==s4);//false(because s4 refers to instance created in nonpool)
		
		System.out.println("\n");
		
		System.out.println(s1.compareTo(s2));// 0(because equals)
		System.out.println(s1.compareTo(s5));// -10(because s1<s5)
		System.out.println(s5.compareTo(s1));// 10(because s5>s1)
		

	}

}
