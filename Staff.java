
public class Staff extends UEmployee {          // staff is a type of UEmployee 
	private String jobTitle;
	public Staff() {};
	public Staff(String n,double s) {                  
		name = n;
		salary = s;
	}
	public Staff(String n,double s, String j) {           // adding a variable to hold a job title for the staff member
		name = n;
		salary = s;
		jobTitle = j;
	}
	public void setJobTitle(String j) {       //creating methods to set values and get values from our new member variables
		jobTitle = j;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	

}
