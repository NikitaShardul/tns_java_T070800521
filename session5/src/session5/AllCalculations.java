package session5;

public class AllCalculations extends Factorial implements Statistical {
	
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum = "+sum);
	}
	
	public int sub(int a, int b) {
		return(a - b);
	}
	
	public void avg(int a, int b) {
		int avg = (a+b)/2;
		System.out.println("Average = "+avg);
	}
	
	public static void main(String[] args) {
		AllCalculations a = new AllCalculations();
		a.add(10,20);
		System.out.println("Sub = "+ a.sub(45, 20));
		a.avg(36,18);
		
	}

}
