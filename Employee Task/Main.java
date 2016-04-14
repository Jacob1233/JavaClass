public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("John");
		Employee e2 = new Employee("Jill", 8.50);
		Employee e3 = new Employee("Jane");
		e1.changeName("Joe");
		e3.changePayRate(10);

		printEmployee(e1);
		printEmployee(e2);
		printEmployee(e3);
	}

	public static void printEmployee(Employee emp) {
		System.out.println("Name: " + emp.getName() + "\tID: "
				+ emp.getEmployeeID() + "\tPayrate: " + emp.getPayRate());
	}
}
