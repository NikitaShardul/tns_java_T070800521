package session08;

import java.util.ArrayList;

public class ListDemo {
       public static void main(String[] args) {
	   ArrayList a = new ArrayList();
	   a.add(10);
	   a.add("N");
	   a.add(null);
	   a.add('D');
	   a.add(45);
	   
	   System.out.println(a);
	   //System.out.println(a.get(7)); IndexOutOfBoundException	   
	   System.out.println(a.get(4));
	   
	  // a.remove(2);
	 //  System.out.println(a);
	 //  a.add(2,40);
	 //  System.out.println(a);
	   
	   a.remove(3);
	   System.out.println(a);
	   a.add(3,'k');
	   System.out.println(a);
	}
}
