package javapractice;

import java.util.StringTokenizer;

public class StringTokenizerTest {


	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("My name is Amit"," ");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
