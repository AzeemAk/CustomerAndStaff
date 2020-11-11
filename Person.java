
public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	public Person() {};
	public Person(String n, String a , String p) {             //creating methods to set values and get values from our member variables
		name = n;
		address = a;
		phoneNumber = p;
	}
	void setName(String n) {
		name = n;
	}
	void setAddress(String a) {
		address = a;
	}
	void setPhoneNumber(String p) {
		phoneNumber = p;
	
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	
	}
}
