package session9;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
       public static void main(String[] args) {
	   LinkedList l = new LinkedList();
	   l.add("Raavi");
	   l.add(23);
	  // l.add(null);
	   l.add("sara");
	   l.add("Raavi");
	   
	   System.out.println(l);
	   
	   l.set(0, "Nikita");
	   System.out.println(l);
	   
	   l.removeFirst();
	   l.removeLast();
	   System.out.println(l);
	   
	   ListIterator itr = l.listIterator();
	   while(itr.hasNext()) {
		   Object o = itr.next();
		   if(o.equals(23)) {
			   itr.set("Snehal");
		   }
	   }
	   System.out.println(l);
	   
	   while(itr.hasPrevious()) {
		   Object n = itr.previous();
		   System.out.println(n);
	   }
	   System.out.println(l);
	}
}
