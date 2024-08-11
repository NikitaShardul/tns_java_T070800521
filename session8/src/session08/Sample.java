package session08;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {
       public static void main(String[] args) {
	   //Generic version of ArrayList
       ArrayList <Integer> a = new ArrayList<Integer>();
       a.add(64);
       a.add(23);
      // a.add("Nikita"); //CTE
       a.add(null);
       
       //System.out.println(a);
       //for(int i : a) {
    	//   System.out.println(i);
       //}
       
       Iterator<Integer> itr = a.iterator();
       while(itr.hasNext()) {
    	   Integer i =itr.next();
    	   if (i == null) {
    		   itr.remove();
    	   }
       }
       
       System.out.println(a);
	}
}
