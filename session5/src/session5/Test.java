package session5;

public class Test {
       public static void main(String[] args) {
		int a,b,c = 0;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("c = "+c);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Denominator should not be zero");
		}
		
		catch(NumberFormatException e) {
			System.out.println("Input integer only");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter atleast two integer value");
		}
		
		catch(Exception e) {
			System.out.println("Exception!!!");
		}
	}
}
