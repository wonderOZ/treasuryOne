package net.ukr.green_dream;

import java.util.Scanner;

public class DaysInTheYear {

	public static void main(String[] args) {
		/*
		 * User input year from keyboard. Program returns quantity of days
		 */
		Scanner sc = new Scanner(System.in);
		int year;
		int days = 365;
		System.out.println("Input year and press Enter");
		year = sc.nextInt();

		if ((year % 4) == 0) {
			days = 366;
		}

		if ((year % 4) == 0 && (year % 100) == 0) {
			days = 365;
		}

		if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0) {
			days = 366;
		}

		System.out.println("Year " + year + " has " + days + " days");
		sc.close();
	}

}
