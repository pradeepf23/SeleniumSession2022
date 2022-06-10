package SeleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListConcept {

	public static void main(String[] args) {
	
		//1. synchronized() method
		ArrayList<String> list= new ArrayList<>(Arrays.asList("praeep", "reema", "supriya"));
		List<String> namelist=Collections.synchronizedList(list);
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		synchronized (namelist) {
			Iterator<String> it=namelist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}	
			
		}	
		//2. CopyOnWriteArrayList class
		CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<String>();
		empList.add("tom");
		empList.add("raj");
		empList.add("john");
		
		Iterator<String> it=empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}	
		
   }
}