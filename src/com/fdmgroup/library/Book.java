package com.fdmgroup.library;

public class Book {
	private String title;
	private int ISBN;

	private int totalCopies;
	private int numOnHand;

//	private Author bookAuthor;

	// constructor
	public Book(String bookTitle, int bookID, int numCopies) {
		ISBN = bookID;
		title = bookTitle;
		totalCopies = numCopies;
		numOnHand = numCopies;
	}

	// getters & setters

	public String getTitle() {
		return title;
	}

	public int getISBN() {
		return ISBN;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public int getNumOnHand() {
		return numOnHand;
	}

	public void setNumOnHand(int numOfAvailableCopies) {
		this.numOnHand = numOfAvailableCopies;
	}

}
