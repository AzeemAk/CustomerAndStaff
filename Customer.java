
public class Customer extends Person {
	public Customer() {};
	public Customer(String n, String a, String p, int c, boolean m ) {
		name = n;
		address = a;
		phoneNumber = p;
		customerNum = c;
		mailingList = m;
	};
	protected int customerNum;
	protected boolean mailingList;
	public void setCustomerNum(int c) {                    //creating methods to set values and get values from our member variables
		customerNum = c;
	}
	public void setMailingList(boolean m) {
		mailingList = m;
	}
	public int getCustomerNum() {
		return customerNum;
	}
	public boolean getMailingList() {
		return mailingList;
	}
	public void print() {
		System.out.println("Name: " + name + "\n" + "Address: " + address + "\n" + "Phone Number: " + phoneNumber + "\n" + "Customer Number: " + customerNum + "\n" + "Mailing List: " + mailingList + "\n");  // setting up output 
	}
	

}
