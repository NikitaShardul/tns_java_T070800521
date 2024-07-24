package session6;

import java.io.FileOutputStream;

public class B {
       public static void main(String[] args) throws Exception {
	   FileOutputStream fos = null;
	   
	   try {
		   fos = new FileOutputStream("d://mno.txt");
		   String str = "Welcome to JSPM's BSIOTR Wagholi!!";
		   byte[] b = str.getBytes();
		   fos.write(b);
	   } catch (Exception e) {
		   System.out.println(e);
	   }
	   
	   finally {
		   System.out.println("In finally");
		   fos.close();
	   }
	}
}
