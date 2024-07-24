package session4;

public class Employee {
      private int empId;
      private String empName;
      Date dt_of_joining;
	
      public Employee() 
      {}

	public Employee(int empId, String empName, Date dt_of_joining) {
		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}
	
	public String toString() {
		return "Employee[empId = " + empId +"empName = " + "dt_of_joining = " + dt_of_joining +"]";
	}
      
    public static void main  (String[] args) {
    	Employee e = new Employee(111, "Nikita", new Date (16,7,2024));
    	System.out.println(e);
    }
      
      
}
