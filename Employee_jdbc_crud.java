package awt_jdbc_exercise_2;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Employee_jdbc_crud extends Frame {
	public Employee_jdbc_crud() {

		// setting up the window frame
		setTitle("EMPLOYEE CRUD OPRATIONS");
		setLayout(null);
		setVisible(true);

		// creating label
		Label emp_no_label = new Label("EMPLOYEE NUMBER");
		Label emp_name_label = new Label("EMPLOYEE NAME");
		Label job_label = new Label("EMPLOYEE JOB ROLE");
		Label salary_label = new Label("EMPLOYEE SALARY");
		Label dept_no_label = new Label("EMPLOYEE DEPARTMENT No");
		Label hire_date_label = new Label("EMPLOYEE HIRE DATE");
		Label table_label = new Label("EMPLOYEE DETAILS TABLE");

		// creating textfields
		TextField emp_no_text = new TextField();
		TextField emp_name_text = new TextField();
		TextField emp_job_text = new TextField();
		TextField emp_salary_text = new TextField();
		TextField emp_hire_date_text = new TextField();

		// creating drop down
		Choice dept_no_choice = new Choice();

		// creating button
		Button first = new Button("FIRST");
		Button next = new Button("NEXT");
		Button prev = new Button("PREVIOUS");
		Button last = new Button("LAST");
		Button add = new Button("ADD");
		Button edit = new Button("EDIT");
		Button del = new Button("DELETE");
		Button save = new Button("SAVE");
		Button clear = new Button("CLEAR");
		Button exit = new Button("EXIT");

		// setting location
		emp_no_label.setBounds(50, 100, 200, 25);
		emp_no_text.setBounds(250, 100, 200, 25);
		emp_name_label.setBounds(500, 100, 200, 25);
		emp_name_text.setBounds(700, 100, 200, 25);
		job_label.setBounds(50, 150, 200, 25);
		emp_job_text.setBounds(250, 150, 200, 25);
		salary_label.setBounds(500, 150, 200, 25);
		emp_salary_text.setBounds(700, 150, 200, 25);
		dept_no_label.setBounds(50, 200, 200, 25);
		dept_no_choice.setBounds(250, 200, 200, 25);
		hire_date_label.setBounds(500, 200, 200, 25);
		emp_hire_date_text.setBounds(700, 200, 200, 25);
		first.setBounds(50, 300, 100, 25);
		next.setBounds(200, 300, 100, 25);
		prev.setBounds(350, 300, 100, 25);
		last.setBounds(500, 300, 100, 25);
		add.setBounds(50, 350, 100, 25);
		edit.setBounds(200, 350, 100, 25);
		del.setBounds(350, 350, 100, 25);
		save.setBounds(500, 350, 100, 25);
		clear.setBounds(200, 400, 100, 25);
		exit.setBounds(350, 400, 100, 25);
		// adding to frame
		add(emp_no_label);
		add(emp_name_label);
		add(job_label);
		add(salary_label);
		add(dept_no_label);
		add(hire_date_label);
		add(emp_no_text);
		add(emp_name_text);
		add(emp_job_text);
		add(emp_salary_text);
		add(dept_no_choice);
		add(emp_hire_date_text);
		add(first);
		add(next);
		add(prev);
		add(last);
		add(add);
		add(edit);
		add(del);
		add(save);
		add(clear);
		add(exit);
		TextArea textarea = new TextArea();
		textarea.setBounds(50, 450, 600, 300);
		add(textarea);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		Employee_jdbc_crud ejc = new Employee_jdbc_crud();
	}

}
