public class Employee {
	private static String name;
	private static double payRate;
	private final int EMPLOYEE_ID;
	private static int nextID = 999;
	public final double STARTING_PAY_RATE = 7.75;

	public Employee(String name) {
		this.EMPLOYEE_ID = getNextID();
		this.name = name;
		this.payRate = STARTING_PAY_RATE;
	}

	public Employee(String name, double startingPay) {
		EMPLOYEE_ID = getNextID();
		this.name = name;
		this.payRate = startingPay;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeID() {
		return EMPLOYEE_ID;
	}

	public double getPayRate() {
		return payRate;
	}

	public void changeName(String newName) {
		name = newName;
	}

	public void changePayRate(double newRate) {
		payRate = newRate;
	}

	private int getNextID() {
		nextID++;
		return nextID;
	}
}
