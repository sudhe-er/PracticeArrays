class Employee{
	protected String name;
	protected int empId;
	protected int leaveCount = 1;

	public Employee(String name, int empId){
		this.name = name;
		this.empId = empId; 
	}

	public void applyForLeave(){
		leaveCount += 1;
		//System.out.println(leaveCount);
	}
}

public class ApplyLeave extends Employee{

	public ApplyLeave(String name, int empId){
		super(name, empId);
	}
	
	public 	void applyForLeave(){
		if(super.leaveCount > 2){
			System.out.println("Sorry, Leave can't be granted to "+super.name+" this month!");
		}
		else{
			super.applyForLeave();
			System.out.println("Leave Granted to "+super.name+" with Employee Id: "+super.empId+" !");
		}
	}

	public static void main(String[] a){
		ApplyLeave emp1 = new ApplyLeave("Ram", 1216);
		emp1.applyForLeave();
		emp1.applyForLeave();
		emp1.applyForLeave();
		emp1.applyForLeave();
		ApplyLeave emp2 = new ApplyLeave("Nani", 1230);
		emp2.applyForLeave();
		emp2.applyForLeave();
		emp2.applyForLeave();	
	}
}