package net.ukr.green_dream;

import java.util.Scanner;

public class LewelTwoTaskOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number and press Enter ");
		int n = sc.nextInt();
		for (int i = 1; i <= (2 * n - 1); i++) {
			int g = n - Math.abs(n - i);
			System.out.println(g + "*");
		}
		sc.close();
	}

}
