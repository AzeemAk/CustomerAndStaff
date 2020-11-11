
public class Faculty extends UEmployee {  // faculty is a type of UEmployee
	public Faculty() {};
	public Faculty(String n, double s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
	public Faculty (String n, double s, String d) {                    //creating methods to set values and get values from our member variables
		name = n;
		salary = s;
		department = d;
	}
	private String department;          //adding a variable to store the department of the faculty member
	public void setDept(String d) {
		department = d;
	}
	public String getDept() {
		return department;
	}

}
