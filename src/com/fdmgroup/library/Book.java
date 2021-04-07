package com.fdmgroup.library;

public class Book {
	private String title;
	private int ISBN;

	// if not assuming only 1 copy of every book
//	private int totalCopies;
//	private int numOfAvailableCopies;

//	private Author bookAuthor;

	// constructor
	public Book(String bookTitle, int bookID) {
		ISBN = bookID;
		title = bookTitle;

// 		add to args: int numCopies,
//		totalCopies = numCopies;
//		numOfAvailableCopies = numCopies;
	}

	// getters & setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

//	public int getTotalCopies() {
//		return totalCopies;
//	}
//
//	public void setTotalCopies(int totalCopies) {
//		this.totalCopies = totalCopies;
//	}
//
//	public int getNumOfAvailableCopies() {
//		return numOfAvailableCopies;
//	}
//
//	public void setNumOfAvailableCopies(int numOfAvailableCopies) {
//		this.numOfAvailableCopies = numOfAvailableCopies;
//	}

}
