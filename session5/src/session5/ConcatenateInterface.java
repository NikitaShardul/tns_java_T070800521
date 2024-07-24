package session5;

public interface ConcatenateInterface {
       public void strConcat(String a, String b);


public default void print(String txt) {
	System.out.println("Text ="+txt);
}

public static void main(String txt1, String txt2) {
	System.out.println(txt1+" "+txt2);
}
}