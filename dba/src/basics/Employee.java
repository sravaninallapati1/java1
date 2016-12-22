package basics;

public class Employee {


	private int employeeId;
	private String employeeName;
	private double employeeSlary;
	private int employeeExp;
	private String employeeLocation;
	private double employeeLoan;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSlary() {
		return employeeSlary;
	}
	public void setEmployeeSlary(double employeeSlary) {
		this.employeeSlary = employeeSlary;
	}
	
	public int getEmployeeExp() {
		return employeeExp;
	}
	public void setEmployeeExp(int employeeExp) {
		this.employeeSlary = employeeSlary;
}
public String getEmployeeLocation() {
	return employeeLocation;
}
public void setEmployeeLocation(String employeeLocation) {
	this.employeeLocation = employeeLocation;
}
public double getEmployeeLoan() {
	return employeeLoan;
}

public void setEmployeeLoan(double employeeLoan) {
	this.employeeLoan = employeeLoan;
}
}