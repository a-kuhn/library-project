package com.fdmgroup.library;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// Create Library
		Library myLib = new Library(123, "FDM Library", "123 Library Lane");

		// Create Librarians & add to Library
		Librarian firstLibEmp = new Librarian("John", "Doe");
		Librarian secondLibEmp = new Librarian("Barney", "Stinson");
		myLib.addLibrarian(firstLibEmp);
		myLib.addLibrarian(secondLibEmp);
		// librarian could have method addBookToInventory --> creates book & adds it to
		// Library inventory

		// add Books & their Authors to Library
		ArrayList<String> authors = new ArrayList<String>();
		authors.add("Frank Herbert");
		authors.add("Frank's Son");
		Book newBook = new Book("Dune", 1234, 4, authors);
		myLib.addBook(newBook);

		ArrayList<String> authors2 = new ArrayList<String>();
		authors.add("J.R. Tolkien");
		Book newBook2 = new Book("The Two Towers", 1111, 7, authors);
		myLib.addBook(newBook2);

		ArrayList<String> authors3 = new ArrayList<String>();
		authors.add("J.R. Tolkien");
		Book newBook3 = new Book("The Two Towers", 1211, 7, authors);
		myLib.addBook(newBook3);

		// add Patrons & their LibraryCards to the Library
		Patron patronBuzz = new Patron("Buzz", "Aldrin");
		LibraryCard libCardBuzz = new LibraryCard(1546);
		patronBuzz.makeLibraryCard(1546);
		myLib.addPatron(patronBuzz);

		Patron patronNeil = new Patron("Neil", "Armstrong");
		LibraryCard libCardNeil = new LibraryCard(1930);
		patronNeil.makeLibraryCard(1930);
		myLib.addPatron(patronNeil);

		Patron patronJohn = new Patron("John", "Glen");
		LibraryCard libCardJohn = new LibraryCard(1546);
		patronJohn.makeLibraryCard(1546);
		myLib.addPatron(patronJohn);

		// Have Patrons loan books
		myLib.checkOutBook(1211, patronBuzz);
		myLib.checkOutBook(1111, patronBuzz);
		myLib.checkOutBook(1111, patronJohn);
		myLib.checkOutBook(1234, patronNeil);

		// look at checked out books
		myLib.printCheckedOutBooks();

		myLib.checkInBook(1111, patronBuzz);
		myLib.printCheckedOutBooks();
	}
}
