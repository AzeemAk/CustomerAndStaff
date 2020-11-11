
public class PreferredCustomer extends Customer {
	private double totalPurchases = 0;
	private double discountLevel;
	public PreferredCustomer() {};
	public PreferredCustomer(String n, String a, String p, int c, boolean m, double tp) {
		name = n;
		address = a;
		phoneNumber = p;
		customerNum = c;
		mailingList = m;
		totalPurchases = tp;
		calcDiscountLevel();                     // calculating discount levels based on a user entered total purchases 
		
	}
	public void addPurchase(double p) {
		totalPurchases += p;
		calcDiscountLevel();              // checking each time we add to the total purchases if the discount level needs to be updated
	}
	 //creating methods to set values and get values from our member variables
	public void setTotalPurchases(double p) {     
		totalPurchases = p;
		calcDiscountLevel();                      // calculating discount levels based on a user entered total purchases 
	}
	public double getTotalPurchases() {
		return totalPurchases;
	}
	public double getDiscountLevel() {
		return discountLevel;
	}
	public void calcDiscountLevel() {                                    //calculating discount levels based on total purchases of the customer
		if(totalPurchases >= 500 && totalPurchases < 1000) {
			discountLevel = 0.05;
		}
		else if(totalPurchases >= 1000 && totalPurchases < 1500) {
			discountLevel = 0.06;
		}
		else if(totalPurchases >= 1500 && totalPurchases < 2000) {
			discountLevel = 0.07;
		}
		else if(totalPurchases >= 2000) {
			discountLevel = 0.10;
		}
		
	}
	public void print() {
		System.out.println("Name: " + name + "\n" + "Address: " + address + "\n" + "Phone Number: " + phoneNumber + "\n" + "Customer Number: " + customerNum + "\n" + "Mailing List: " + mailingList + "\n");
		System.out.println( "Total Purchases: $" + totalPurchases + "\n" + "Discount Level: " + discountLevel + "\n");
	}
	
	
	
	

}
