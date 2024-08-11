package session08;

public class Demo {
       public static void main(String[] args) {
	   
       //Primitive to Wrapper
       int no = 100;
       Integer i = new Integer(no);

       //Wrapper to Primitive
       int a = i.intValue();
       
       //String to Primitive
       String str = "30";
       int b = Integer.parseInt(str);
       
       //String to Wrapper
       Integer c= Integer.valueOf(str);
	}
}
