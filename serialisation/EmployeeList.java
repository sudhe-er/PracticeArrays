package serialisation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EmployeeList {
	public static List<Employee> employees = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		File fp = new File("C:\\Users\\USER\\OneDrive\\Desktop\\Html\\EmployeeDetails.txt");
		EmployeeList empl = new EmployeeList();
		Scanner input = new Scanner(fp);
		while(input.hasNext()) {
			String line = input.nextLine();
			StringTokenizer stk = new StringTokenizer(line, ",");
			employees.add(new Employee(Integer.parseInt(stk.nextToken()), stk.nextToken(), stk.nextToken(), Double.parseDouble(stk.nextToken()), Integer.parseInt(stk.nextToken())) );
			
		}
		for(Employee e : employees) {
			e.getDetails();
		}
		input.close();
	}
}
