package net.ukr.green_dream;

import java.util.Scanner;

public class LewelTwoTaskThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input uneven number and press Enter.");
		int n = sc.nextInt();
		if ((n % 2) == 0) {
			System.out.println("The number is even. Please change it.");
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if ((i == j) || (i <= j) ^ (Math.abs(i - n + 1) <= j)
							|| (Math.abs(i - n + 1) == j)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

		sc.close();
	}

}
