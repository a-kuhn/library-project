package com.fdmgroup.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
	private Book loanedBook;
	private LibraryCard cardUsedForLoan;
	private String checkOutDate;
	private String checkOUtDate;
	private boolean isActive;

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

	public void setLoanedBook(Book loanedBook) {
		this.loanedBook = loanedBook;
	}

	public LibraryCard getCardUsedForLoan() {
		return cardUsedForLoan;
	}

	public void setCardUsedForLoan(LibraryCard cardUsedForLoan) {
		this.cardUsedForLoan = cardUsedForLoan;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCheckOUtDate() {
		return checkOUtDate;
	}

	public void setCheckOUtDate(String checkOUtDate) {
		this.checkOUtDate = checkOUtDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
