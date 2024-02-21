package Shankar;

import java.util.Date;

class Students {
	int regno;
	String fullName;
	Date dob;
	String branch;
	float cgpa;
	short yearOfPassing;

	Students(int regno, String fullName, Date dob, String branch, float cgpa, short yearOfPassing) {
		this.regno = regno;
		this.fullName = fullName;
		this.dob = dob;
		this.branch = branch;
		this.cgpa = cgpa;
		this.yearOfPassing = yearOfPassing;
	}

	void displayProfile() {
		System.out.println("\n regno:" + regno + "\n fullName:" + fullName + "\n dob:" + dob + "\n branch:" + branch
				+ "\n cgpa:" + cgpa + " yearOfPassing:" + yearOfPassing);

	}

	public String toString() {
		return regno + " " + fullName + " " + dob + " " + branch + " " + cgpa + " " + yearOfPassing;
	}

	public float getcgpa() {

		return this.cgpa;
	}

}
