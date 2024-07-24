package session5;

public class Demo {
       public static void getMsg() {
    	   msg();
       }
       
       public static void msg() {
    	   int i =10/0;
       }
       
       public static void main(String[] args) {
		Demo.getMsg();
	}
}
