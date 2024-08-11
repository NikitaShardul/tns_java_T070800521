package session10;

import java.util.Enumeration;
import java.util.Stack;

public class VectorDemo {
       public static void main(String[] args) {
	   Stack s = new Stack();
	   s.push(36);
	   s.push("Disha");
	   s.push(null);
	   s.push("Sarthak");
	   s.push(32);
    	   System.out.println(s);
    	   
    	   s.pop();
    	   System.out.println(s);
    	   System.out.println(s.capacity());
    	   System.out.println(s.size());   
       Stack<String> d = new Stack<String>();
       d.push("Aryan");
       d.push("Avni");
       System.out.println("------>");
       Enumeration<String> e = d.elements(); 
       while(e.hasMoreElements()) {
    	   //String o = e.nextElement();
    	   System.out.println(e.nextElement());
       }   
	}
}
