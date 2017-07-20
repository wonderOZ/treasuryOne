package net.ukr.green_dream;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number 4 < n < 16 ");
		int n = sc.nextInt();
		if ((4 < n) && (n < 16)) {
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			System.out.println("Factorial of nuber " + n + " = " + factorial);
		} else {
			System.out.println("You inputed wrong number");
		}

		sc.close();
	}

}
