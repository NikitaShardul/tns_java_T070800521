package session6;

public class Test {
       public static void main(String[] args) {
    	   A a = new A();
    	   double d = a.div(4, 9);
    	   if(d<1) {
    		   try {
    			   throw new MyException();
    		   } catch (MyException e) {
    			   System.out.println(e);
    		   }
    	   }
    	   
    	   System.out.println("d = "+d);
       }
}
