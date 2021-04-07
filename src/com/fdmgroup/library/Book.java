package com.fdmgroup.library;

public class Book {
	private String title;
	private int ISBN;
	private int totalCopies;
	private int numOfAvailableCopies;

	// constructor
	public Book(String bookTitle, int numCopies, int bookID) {
		ISBN = bookID;
		title = bookTitle;
		totalCopies = numCopies;
		numOfAvailableCopies = numCopies;
	}

	// getters & setters
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getTotalCopies() {
		return totalCopies;
	}

	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	public int getNumOfAvailableCopies() {
		return numOfAvailableCopies;
	}

	public void setNumOfAvailableCopies(int numOfAvailableCopies) {
		this.numOfAvailableCopies = numOfAvailableCopies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
