package com.fdmgroup.library;

import java.util.ArrayList;

public class LibraryCard {
	private int cardNum;
	private ArrayList<Book> borrowedBooks;

	// Constructor
	public LibraryCard(int cardNumber) {
		cardNum = cardNumber;
	}

	// Getters & Setters
	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	// get list all books borrowed
	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	// get list of books borrowed + number of times borrowed
	// need to keep track

}
