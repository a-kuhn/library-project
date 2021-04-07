package com.fdmgroup.library;

public abstract class Person {
	public String fName;
	public String lName;

	// constructor
	public Person(String firstName, String lastName) {
		this.fName = firstName;
		this.lName = lastName;
	};

	// getters & setters
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getFullName() {
		return this.fName + " " + this.lName;
	}

}
