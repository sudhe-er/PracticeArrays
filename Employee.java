package EmployeeCrud;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Employee {
	JFrame frame;
	JButton add;
	JButton next;
	JButton prev;
	JButton first;
	JButton last;
	JButton edit;
	JButton clear;
	JButton exit;
	JButton delete;

	public Employee() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame = new JFrame("Employee CRD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first = new JButton("First");
		add = new JButton("Add");
		next = new JButton("Next");
		prev = new JButton("Previous");
		last = new JButton("Last");
		edit = new JButton("Edit");
		clear = new JButton("Clear");
		exit = new JButton("Exit");
		delete = new JButton("Delete");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.add(first);
		panel1.add(next);
		panel1.add(prev);
		panel1.add(last);

		panel2.setLayout(new BorderLayout());
		panel2.add(add, BorderLayout.NORTH);
		panel2.add(edit, BorderLayout.SOUTH);
		panel2.add(delete, BorderLayout.WEST);
		panel2.add(clear, BorderLayout.EAST);
		panel2.add(exit, BorderLayout.CENTER);

		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

		frame.add(panel1);
		frame.add(panel2);
		// frame.setLayout(new FlowLayout());
		frame.setSize(650, 650);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Employee();
	}

}
