package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Amit");
		list.add("Kumdan");
		list.add("Raushan");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		list.add("LOL");
		for(String l:list) {
			System.out.println(l);
		}
	}

}
