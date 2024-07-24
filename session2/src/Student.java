
public class Student {
       private int rollNo;
       private String name;
       private static String collegeName;
       private static int count;
       
       public Student() {}
    	   public Student (int rollNo, String name)
    	   {
    		   this.rollNo = rollNo;
    		   this.name = name;
    		   count++;
    		   }
    	   
	public String toString() {
		return "Student[rollNo = "+rollNo+","+" name = "+name+", college = "+collegeName+"]";		
	}
	public static int getCount() {
		return count;
	}
	
	static
	{
		System.out.println("In static block!!");
		count = 60;
		collegeName = "JSPM BSIOTR";
	}
	
	public static void main(String[] args) {
		System.out.println("In main block!!");
		Student s1 = new Student(1,"Nikita");
		System.out.println(s1);
		Student s2 = new Student(2, "Mansi");
		System.out.println(s2);
		Student s3 = new Student(3, "Shivangi");
		System.out.println(s3);
		System.out.println("Count = "+Student.getCount());
	}
	
	
    	   
}









