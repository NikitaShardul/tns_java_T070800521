
public class Addition {
      public int add(String s,int... a)
      {
    	  System.out.println("Length = "+a.length);
    	  int sum = 0;
    	  for(int i=0; i< a.length; i++) {
    		  sum = sum + a[i];
    	  }
    	  return sum;
      }
      
      public static void main(String[] args) {
    	  Addition a = new Addition();
    	  int s = a.add("abc", 10,20);
    	  System.out.println("Addition = " +s);
    	  System.out.println("Sum = "+a.add("mno",1,2,3));
    	  System.out.println("Sum ="+a.add("xyz",53,28,45));
      }
}
