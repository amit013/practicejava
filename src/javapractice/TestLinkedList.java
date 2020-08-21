package javapractice;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Amit");
		list.add("Kundan");
		list.add("Raushan");
		list.add("LOL");
		
		for(String l:list) {
			System.out.println(l);
		}
		list.remove(3);
		for(String l:list) {
			System.out.println(l);
		}
	}

}
