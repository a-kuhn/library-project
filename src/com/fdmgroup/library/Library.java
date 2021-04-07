package com.fdmgroup.library;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private int libID;
	private String libName;
	private String libAddress;
	private ArrayList<Librarian> librarians;
	private ArrayList<Patron> patrons;
	private ArrayList<Book> books;
	private ArrayList<Loan> loans;

	public Library(int libID, String libName, String libAddress) {
		this.libID = libID;
		this.libName = libName;
		this.libAddress = libAddress;
		librarians = new ArrayList<Librarian>();
		patrons = new ArrayList<Patron>();
		books = new ArrayList<Book>();
		loans = new ArrayList<Loan>();
	}

	public boolean addLibrarian(Librarian l) {
		if (librarians.contains(l)) {
			System.err.print("Librarian Already Exists");
			return false;
		} else {
			librarians.add(l);
			return true;
		}
	}

	public boolean addPatron(Patron p) {
		if (patrons.contains(p)) {
			System.err.print("Patron Already Exists");
			return false;
		} else {
			patrons.add(p);
			return true;
		}
	}

	public boolean addBook(Book b) {
		if (books.contains(b)) {
			System.err.print("Book Already Exists");
			return false;
		} else {
			books.add(b);
			return true;
		}
	}

	public Book searchBooks(String title) {
		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			Book tempBook = iter.next();
			if (tempBook.getTitle().equals(title)) {
				return tempBook;
			}
		}

		return null;
	}

	public Book searchBooks(int ISBN) {
		Iterator<Book> iter = books.iterator();
		while (iter.hasNext()) {
			Book tempBook = iter.next();
			if (tempBook.getISBN() == ISBN) {
				return tempBook;
			}
		}

		return null;
	}

	public boolean checkOutBook(int ISBN, Patron p) {
		Book tempBook;
		Loan newLoan;
		LibraryCard tempCard;

		tempBook = searchBooks(ISBN);

		if (tempBook.getTotalCopies() == 0) {
			return false;
		}

		if (!p.hasLibraryCard()) {
			p.makeLibraryCard(patrons.size() + 1);
		}

		tempCard = p.getLibraryCard();

		newLoan = new Loan(tempBook, tempCard);

		tempCard.addLoan(newLoan);

		tempBook.setNumOnHand(tempBook.getNumOnHand() - 1);

		return true;
	}

	public boolean checkInBook(int ISBN, Patron p) {
		Book tempBook;
		Loan loanEnding;
		LibraryCard card;

		card = p.getLibraryCard();

		Iterator<Loan> iter = loans.iterator();

		while (iter.hasNext()) {
			loanEnding = iter.next();
			if ((loanEnding.getLoanedBook().getISBN() == ISBN)
					&& (card.getCardNum() == loanEnding.getCardUsedForLoan().getCardNum())) {
				loanEnding.setIsActive(false);
				tempBook = loanEnding.getLoanedBook();
				tempBook.setNumOnHand(tempBook.getNumOnHand() + 1);
				return true;
			}
		}

		return false;
	}

	public void printCheckedOutBooks() {
		Patron currentPatron;
		Iterator<Patron> iter = patrons.iterator();

		System.out.println("Current Patrons and Checked Out Books");

		while (iter.hasNext()) {
			currentPatron = iter.next();
			System.out.println(
					currentPatron.getFullName() + ": " + currentPatron.getLibraryCard().findCheckedOutTitles());
		}
	}
}
