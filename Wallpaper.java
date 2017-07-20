package net.ukr.green_dream;

import java.util.Scanner;

public class Wallpaper {
	/*
	 * Program draws wallpaper
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of lines and press Enter ");
		int n = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
