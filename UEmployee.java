
public class UEmployee {
	protected String name;
	protected double salary;
	public UEmployee() {};
	public UEmployee(String n, double s) {          //creating methods to set values and get values from our member variables
		name = n;
		salary = s;
	}
	public void setName(String n) {
		name = n;
	}
	public void setSalary(double s) {
		salary = s;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

}


