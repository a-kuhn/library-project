package com.fdmgroup.library;

import java.util.ArrayList;

public class LibraryCard {
	private int libraryCardID;
	private ArrayList<Loan> loans;

	// Constructor
	public LibraryCard(int cardNumber) {
		libraryCardID = cardNumber;
		loans = new ArrayList<Loan>();
	}

	// Getters & Setters
	public int getLibraryCardID() {
		return libraryCardID;
	}

	public void setLibraryCardNID(int cardNum) {
		this.libraryCardID = cardNum;
	}

	// get list of all books borrowed
	public void loansList() {
		for (Loan l : loans) {
			if (l.isActive()) {
				System.out.println(l.getLoanedBook().getTitle());
			}
		}
	}

	public String findCheckedOutTitles() {
		StringBuilder stBuild = new StringBuilder("");
		int counter = 0;

		for (Loan l : loans) {
			if (l.isActive()) {
				if (counter != 0) {
					stBuild.append(", ");
				}
				stBuild.append(l.getLoanedBook().getTitle());
				counter++;
			}
		}
		String myString = stBuild.toString();
		return myString;
	}

	// add new book to borrowedBooks
	public void addLoan(Loan newLoan) {
		loans.add(newLoan);
	}
}
