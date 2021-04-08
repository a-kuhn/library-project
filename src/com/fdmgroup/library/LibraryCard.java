package com.fdmgroup.library;

import java.util.ArrayList;

// should this be a separate class, or included with Patron?
// good for normalization, maybe not quite right to assume Patron wouldn't have a LibraryCard
public class LibraryCard {
	private int cardNum;
	private ArrayList<Loan> loans;

	// Constructor
	public LibraryCard(int cardNumber) {
		cardNum = cardNumber;
		loans = new ArrayList<Loan>();
	}

	// Getters & Setters
	public int getCardNum() {
		return cardNum;
	}

	public void setLibraryCardNID(int cardNumber) {
		this.cardNum = cardNumber;
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
		for (int i = 0; i < loans.size(); i++) {
			Loan l = loans.get(i);
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

//	public String findCheckedOutTitles() {
//		StringBuilder stBuild = new StringBuilder("");
//		int counter = 0;
//
//		for (Loan l : loans) {
//			System.out.println(l);
//			if (l.isActive()) {
//				if (counter != 0) {
//					stBuild.append(", ");
//				}
//				stBuild.append(l.getLoanedBook().getTitle());
//				counter++;
//			}
//		}
//		String myString = stBuild.toString();
//		return myString;
//	}

	// add new book to borrowedBooks
	public void addLoan(Loan newLoan) {
		loans.add(newLoan);
	}
}
