package net.ukr.green_dream;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		/*
		 * User inputs four-digit number. Program checks if number is "Lucky"
		 */
		int a;
		int b;
		int c;
		int d;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input four-digit number and press Enter");
		int nuber = sc.nextInt();
		a = nuber / 1000 + nuber % 1000 / 100;
		b = nuber % 100 / 10 + nuber % 10;
		c = a / 10 + a % 10;
		d = b / 10 + b % 10;
		if (c == d) {
			System.out.println("Number is \"Lucky\"!");
		} else {
			System.out.println("Number isn't \"Lucky\".");
		}
		sc.close();
	}

}
