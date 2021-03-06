package com.fdmgroup.library;

import java.util.Objects;

public class Patron extends Person {
	private LibraryCard libCard;

	// constructor
	public Patron(String fName, String lName) {
		super(fName, lName);
	}

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

	public void setLibraryCard(LibraryCard libCard) {
		this.libCard = libCard;
	}

	public void makeLibraryCard(int cardNum) {
		libCard = new LibraryCard(cardNum);
	}
}