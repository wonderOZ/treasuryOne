package net.ukr.green_dream;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input lenghth and press Enter ");
		int lenghth = sc.nextInt();
		System.out.println("Input heighth and press Enter ");
		int heighth = sc.nextInt();

		for (int i = 0; i < heighth; i++) {
			for (int j = 0; j < lenghth; j++) {
				if ((i == 0) || (i == (heighth - 1)) || (j == 0)
						|| (j == (lenghth - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
