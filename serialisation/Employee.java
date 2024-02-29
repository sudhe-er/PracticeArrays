package serialisation;

public class Employee {
	
	private int empId;
	private String empName;
	private String designation;
	private double salary;
	private int yearsOfExperience;
	public Employee(int empId, String empName, String designation, double salary, int yearsOfExperience) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void getDetails() {
		System.out.println("Employee Id: \t"+this.getEmpId());
		System.out.println("Employee Name: \t"+this.getEmpName());
		System.out.println("Employee Designation: \t"+this.getDesignation() );
		System.out.println("Employee Salary: \t"+this.getSalary());
		System.out.println("Years Of Experience: \t"+this.getYearsOfExperience());
		System.out.println();
	}
	
	

}
