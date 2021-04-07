package com.fdmgroup.library;

import java.util.Date;

public class Loan {
	private Date checkOutDate;
	private Date checkOUtDate;
	private Book loanedBook;
	private LibraryCard cardUsedForLoan;
	private boolean isActive;
// constructor will set checkoutDate as currentDate upon creation
//	set checkIn to 2 weeks after current date
//	set active to true as default

	public Loan(Book book, LibraryCard lCard) {
		checkOutDate = // currDate;
		checkInDate = //currDate + 2 wks;
		
	}
}
