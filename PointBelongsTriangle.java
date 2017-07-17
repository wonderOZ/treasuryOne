package net.ukr.green_dream;

import java.util.Scanner;

public class PointBelongsTriangle {

	public static void main(String[] args) {
		/*
		 * There is triangle A(0;0) B(4;4) C(6;1). User input point D(x;y) using
		 * keyboard. Program checks if point is inside triangle.
		 */
		double sABC;
		double sABD;
		double sACD;
		double sBCD;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input coordinate X");
		double x = sc.nextDouble();

		System.out.println("Input coordinate Y");
		double y = sc.nextDouble();

		sABC = Math.abs((0 - 6) * (4 - 1) - (4 - 6) * (0 - 1)) / 2;
		sABD = Math.abs((0 - x) * (4 - y) - (4 - x) * (0 - y)) / 2;
		sACD = Math.abs((0 - x) * (1 - y) - (6 - x) * (0 - y)) / 2;
		sBCD = Math.abs((4 - x) * (1 - y) - (6 - x) * (4 - y)) / 2;

		if (sABC == (sABD + sACD + sBCD)) {
			System.out.println("Point belongs triangle ");
		} else {
			System.out.println("Point doesn't belong triangle ");
		}
		sc.close();

	}

}
