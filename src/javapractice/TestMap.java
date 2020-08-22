package javapractice;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"Amit");
		map.put(3,"Kundan");
		map.put(2,"Raushan");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
