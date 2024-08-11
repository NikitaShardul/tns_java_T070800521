package session11;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
       public static void main(String[] args) {
	   HashSet h = new HashSet();
	   h.add("N");
	   h.add("n");
	   h.add(null);
	   h.add(10);
	   h.add("z");
	   System.out.println(h.add("N"));
	   System.out.println(h);
	   System.out.println(h.size());
	   h.remove("A");
	   System.out.println(h);
	   
	   LinkedHashSet l = new LinkedHashSet();
	   l.add("N");
	   l.add("n");
	   l.add(null);
	   l.add(10);
	   l.add("z");
	   System.out.println(l.add("N"));
	   System.out.println(l);
	   System.out.println(l.size());
	   h.remove("A");
	   System.out.println(l);
	   
       }
}
