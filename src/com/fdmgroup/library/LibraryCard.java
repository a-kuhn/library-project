package com.fdmgroup.library;

import java.util.ArrayList;

public class LibraryCard {
	private int libraryCardID;
	private ArrayList<Book> borrowedBooks;

	// Constructor
	public LibraryCard(int cardNumber) {
		libraryCardID = cardNumber;
	}

	// Getters & Setters
	public int getLibraryCardID() {
		return libraryCardID;
	}

	public void setLibraryCardNID(int cardNum) {
		this.libraryCardID = cardNum;
	}

	// get list of all books borrowed
	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	// add new book to borrowedBooks
	public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	// get list of books borrowed + number of times borrowed
	// need to keep track

	// TODO add booksBorrowed() - enumerate through loans
	// make hashmap - ISBN : #ofTimesBorrowed
	// output : each line "Book Title ISBN #ofTimesBorrowed (extra functionality
	// active status)
	// TODO add attribute loans - arraylist of all borrowed books
	// TODO add activeLoans() - filter loans list for active=true
	// list book title, isbn, checkout, checkin. order by checkin
}
