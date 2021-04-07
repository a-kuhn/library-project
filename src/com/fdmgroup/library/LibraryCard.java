package com.fdmgroup.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
	public ArrayList<Loan> listBorrowedBooks() {
		Map<String, Integer> loansMap = new HashMap<String, Integer>();
		ArrayList<Loan> loansList = loans;
		Iterator it =  new loansList.iterator();

		while (it.hasNext()) {
			Loan tempLoan = it.Next();
			if (tempLoan.isActive()) {
				String bookinfo = tempLoan.getLoanedBook().getISBN() + ": " + tempLoan.getLoanedBook().getTitle();
				if(loansMap.containsKey(bookInfo)) {
					int tempInt = 
				}
			}
		}
		
		return loans;
	}

	public ArrayList<Loan> loansList() {
		ArrayList<Loan> activeLoans = new ArrayList<Loan>();

		for (Loan l : loans) {
			if (l.isActive()) {
				activeLoans.add(l);
			}
		}
		return activeLoans;
	}

	// add new book to borrowedBooks
	public void addLoan(Loan newLoan) {
		loans.add(newLoan);
	}

	// remove loan from borrowedBooks (simulate checkIn) --- INTERFACE???

	// get list of books borrowed + number of times borrowed

	// TODO add booksBorrowed() - enumerate through loans
	// make hashmap - ISBN : #ofTimesBorrowed
	// output : each line "Book Title ISBN #ofTimesBorrowed (extra functionality
	// active status)
	// TODO add attribute loans - arraylist of all borrowed books
	// TODO add activeLoans() - filter loans list for active=true
	// list book title, isbn, checkout, checkin. order by checkin
}
