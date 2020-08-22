package javapractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapCompareByValue {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1,"Amit");
		map.put(5,"Kundan");
		map.put(2,"Raushan");
		
		map.entrySet() //return a set view
		.stream()  	   //return sequential stream as source
		.sorted(Map.Entry.comparingByValue()) //sorted according to comparator
		.forEach(System.out::println);

	}

}
