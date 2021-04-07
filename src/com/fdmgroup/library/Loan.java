package com.fdmgroup.library;

import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Loan {
	private Date checkOutDate;
	private Date checkOUtDate;
	private Book loanedBook;
	private LibraryCard cardUsedForLoan;
	private boolean isActive;
// constructor will set checkoutDate as currentDate upon creation
//	set checkIn to 2 weeks after current date
//	set active to true as default

	// constructor
	public Loan(Book book, LibraryCard lCard) {
		Date checkOutDate = new Date();
		Date checkInDate = ;
		 isActive = true;
	}

	// date formatter
	public String dateFormatter(Date dateToFormat) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

}
