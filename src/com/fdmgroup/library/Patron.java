package com.fdmgroup.library;

import java.util.Objects;

public class Patron extends Person {
	private LibraryCard libCard;

	// methods
	public boolean hasLibraryCard() {
		if (Objects.isNull(libCard)) {
			return false;
		} else {
			return true;
		}
	}

	public LibraryCard getLibraryCard() {
		return libCard;
	}

	public void makeLibraryCard(int cardNum) {
		libCard = new LibraryCard(cardNum);
	}

	// constructor
	public Patron(String fName, String lName) {
		super(fName, lName);
	}
}