package javapractice;

import java.util.Stack;

public class TestStack {

		public static void main(String[] args) {
			Stack<String> s=new Stack<String>();
			s.add("Amit");
			s.add("Kundan");
			s.add("Raushan");
			s.add("LOL");
			
			for(String l:s) {
				System.out.println(l);
			}
			s.pop();
			for(String l:s) {
				System.out.println(l);
			}
		}	
}
