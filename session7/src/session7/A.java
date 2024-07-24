package session7;

import java.util.Scanner;

public class A {
       public static void main(String[] args) {
	   String str = "Nikita";
	   System.out.println(str);
	   str = str.concat(" Nitin Shardul");
	   System.out.println(str);
	   System.out.println(str.length());
	   
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter a character : ");
	   char ch = s.next().charAt(0);
	   System.out.println("Ch = "+ch);
	   
	   System.out.println(str.toUpperCase());
	   System.out.println(str.substring(7));
	}
}
