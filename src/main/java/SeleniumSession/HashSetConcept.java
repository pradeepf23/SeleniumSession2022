package SeleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {
		
		
		ArrayList<String> list= new ArrayList<>();
		list.add("pradeep");
		list.add("prashant");
		list.add("pramod");
		list.add("naveen");
		list.add("manu");
		list.add("pradeep");
		
		
		System.out.println(list);
		
		HashSet<String> listwithoutDuplicate= new HashSet<>(list);
		System.out.println(listwithoutDuplicate);
		
		Iterator<String> it=listwithoutDuplicate.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

		ArrayList<Integer> number= new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6,7,2));
		System.out.println(number);
		
		HashSet<Integer> numwithoutDuplicate= new HashSet<>(number);
		System.out.println(numwithoutDuplicate);
		Iterator<Integer> it1=numwithoutDuplicate.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		HashSet<Integer> hs= new HashSet<>();
		hs.add(22);
		hs.add(55);
		hs.add(4);
		hs.add(1);
		hs.add(6);
		hs.add(8);
		
		Iterator<Integer> num=hs.iterator();
		while(num.hasNext()) {
			System.out.println(num.next());
		}
		
		
		
		
		
	}

}
