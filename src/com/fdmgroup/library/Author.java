package com.fdmgroup.library;

public class Author extends Person {
	private String fName;
	private String lName;

	// constructor
	public Author(String fName, String lName) {
		super(fName, lName);
	}

	// getters
	public String getFName() {
		return fName;
	}

	public String getLName() {
		return lName;
	}
}
