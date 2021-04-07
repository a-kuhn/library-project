package com.fdmgroup.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestingMethods {

	public static void main(String[] args) {
//		LocalDate currDate = new LocalDate();
//		String dateString = currDate.toString();
//		System.out.println(dateString);

		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today);

		// add 2 week to the current date
		LocalDate next2Week = today.plus(2, ChronoUnit.WEEKS);
		System.out.println("Next week: " + next2Week);

	}

}
