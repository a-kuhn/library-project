package com.fdmgroup.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
	private String title;
	private int ISBN;
	private ArrayList<Author> authors;
	private int totalCopies;
	private int numOnHand;

//	private Author bookAuthor;

	// constructor
	public Book(String bookTitle, int bookID, int numCopies, ArrayList<String> authors) {
		ISBN = bookID;
		title = bookTitle;
		totalCopies = numCopies; // this info should belong to the library
		numOnHand = numCopies; // this info should belong to the library
		// constructor for Author built by parsing & splitting ArrayList<Stirng> authors
		Iterator<String> it = authors.iterator();

		while (it.hasNext()) {
			String[] stArr = it.next().split(" ");
			Author tempAuthor = new Author(stArr[0], stArr[1]);
		}
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
