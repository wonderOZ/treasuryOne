package net.ukr.green_dream;

import java.util.Scanner;

public class TriangleExistance {

	public static void main(String[] args) {
		/*
		 * Program checks if triangle can exist.
		 */
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Input first lengst of triangle");
		a = sc.nextInt();

		System.out.println("Input second lengst of triangle");
		b = sc.nextInt();

		System.out.println("Input third lengst of triangle");
		c = sc.nextInt();

		if ((a + b) > c && (b + c) > a && (c + a) > b) {
			System.out.println("Triangle exists");
		} else {
			System.out.println("Triangle does not exist");
		}
		sc.close();
	}

}
