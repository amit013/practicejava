package javapractice;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Amit");
		v.add("Kundan");
		v.add("Raushan");
		v.add("LOL");
		
		for(String l:v) {
			System.out.println(l);
		}
		v.set(3, "Baklol");
		for(String l:v) {
			System.out.println(l);
		}
	}
}
