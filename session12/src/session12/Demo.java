package session12;

import java.util.Hashtable;

public class Demo {
	   public static void main(String[] args) {
		   Hashtable<Integer, String> h = new Hashtable<Integer, String>();
	       h.put(67 ,  " A");
	       h.put(89 , " B");
	       h.put(5, " C");
	       h.put(7, " D");
	       h.put(11, " E");
	       h.put(1 , " F");
           System.out.println(h.put(1, "F"));
           //h.put(10,  null); //NullPointerException
           System.out.println(h);
	}
}
