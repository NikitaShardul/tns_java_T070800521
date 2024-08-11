package session11;

import java.util.TreeSet;

public class TreeSetDemo {
       public static void main(String[] args) {
	   TreeSet <String> t = new TreeSet();
	   t.add("A");
	   t.add("a");
	   t.add("K");
	   t.add("m");
	   //t.add(10); //ClassCastException
	   //t.add(null); //NullPointerException
	   System.out.println(t);
	   //Default Sorting Order - Ascending Order
	}
}
