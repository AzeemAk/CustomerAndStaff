
public class Lab2runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UEmployee emp1 = new UEmployee();
		emp1.setName("Azeem");
		emp1.setSalary(60000.00);
		System.out.println("Name: " + emp1.getName() + "\n" + "Salary: " + emp1.getSalary() + "\n");
		Faculty emp2 = new Faculty("Brian", 50000);
		emp2.setDept("Computer Science");
		System.out.println("Name: " + emp2.getName() + "\n" + "Salary: " + emp2.getSalary() + "\n" + "Department: " + emp2.getDept() + "\n");
		Staff emp3 = new Staff("Josh", 40000);
		emp3.setJobTitle("Janitor");
		System.out.println("Name: " + emp3.getName() + "\n" + "Salary: " + emp3.getSalary() + "\n" + "Job Title: " + emp3.getJobTitle() + "\n");
		Customer cus1 = new Customer("Azeem", "123 new street", "9178697586", 123, true);
		cus1.print();
		PreferredCustomer cus2 = new PreferredCustomer("Nick", "987 old place", "1234567890", 987, false, 2000);
		cus2.print();
		
		
		

	}

}
