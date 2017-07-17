package net.ukr.green_dream;

import java.util.Scanner;

public class Polyndrom {

	public static void main(String[] args) {
		/*
		 * User inputs six-digit number. Program checks if number is polyndrom
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Input six-digit number and press Enter");
		int number = sc.nextInt();
		if ((number / 100000 == number % 10)
				&& (number % 100000 / 10000 == number % 100 / 10)
				&& (number % 10000 / 1000 == number % 1000 / 100)) {
			System.out.println("Number " + number + " is polyndrom.");
		} else {
			System.out.println("Number " + number + " isn't polyndrom.");
		}
		sc.close();
		
	}

}
