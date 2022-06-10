package SeleniumSession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMappractice {

	public static void main(String[] args) {
		
		// no order- no index
		//stores value-- on the basis key value format
		//key canot be duplicate
		//multiple null values allowed
		
		HashMap<String, String> capitalmap1= new HashMap<String, String>();
		capitalmap1.put("India", "Delhi");
		capitalmap1.put("US", "washington DC");
		capitalmap1.put("UK", "London");
		capitalmap1.put("RK", null);
		capitalmap1.put(null, "abc");
		capitalmap1.put("lk", null);
		
		
		System.out.println(capitalmap1.get("India"));
		//System.out.println(capitalmap1.get("India"));
		Iterator<String> it=capitalmap1.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value= capitalmap1.get(key);
			System.out.println("key is: " +key +" and value is: " + value);
			
		}
		System.out.println("---------------");
		
		//iterator using entrySet
		Iterator<Entry<String, String>> it1= capitalmap1.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry=it1.next();
			System.out.println("key is: " + entry.getKey() +" and value is: " + entry.getValue());
		}
	
		System.out.println("---------------");
		//using lambda
		
		capitalmap1.forEach((k,v)-> System.out.println("key is: "+k+" and valueis: " +v));
	}

}
