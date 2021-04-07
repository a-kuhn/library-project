package com.fdmgroup.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
	private Book loanedBook; // get
	private LibraryCard cardUsedForLoan; // get
	private String checkOutDate; // get
	private String checkInDate; // get
	private boolean isActive; // get & set

	// constructor
	public Loan(Book book, LibraryCard lCard) {
		Book loanedBook = book;
		LibraryCard cardUsedForLoan = lCard;
		LocalDate checkOutDate = LocalDate.now();
		LocalDate checkInDate = checkOutDate.plus(2, ChronoUnit.WEEKS);
		isActive = true;
	}

	// getters & setters
	public Book getLoanedBook() {
		return loanedBook;
	}

	public LibraryCard getCardUsedForLoan() {
		return cardUsedForLoan;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

}
