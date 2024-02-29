package serialisation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeListSorted {
	 public static List<Employee> empList;
	
	public static void main(String[] args) {
		empList = EmployeeList.employees;
		for(Employee i : empList)
		i.getDetails();
		 
		
		Collections.sort(empList,
				new Comparator<> () {
			public int compare(Employee e1, Employee e2) {
				return (int)e1.getSalary() - (int)e2.getSalary();
			}
		});
		
		for(Employee e : empList) {
			e.getDetails();
		}
	}

}
