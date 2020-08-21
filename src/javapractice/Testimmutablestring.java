package javapractice;

public class Testimmutablestring {

	public static void main(String[] args) {
		String st="Sachin";
		String s="sachin";
		s.concat("tendulkar"); //concat() method appends the string at last
		
		st=st.concat("Tendulkar"); //Explictely assigning to a reference variable 
		
		System.out.println(s); //will print sachin as strings are immutable object
		
		System.out.println(st);

	}

}
