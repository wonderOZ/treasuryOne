package net.ukr.green_dream;

import java.util.Scanner;

public class PointBelongsCircle {

	public static void main(String[] args) {
		/*
		 * There is circle with radius r. Coordinates of circule's center (0;0).
		 * Program checks if point (x;y) belongs to circle
		 */
		double r;
		double x;
		double y;
		double gipotenuza;

		Scanner sc = new Scanner(System.in);

		System.out.println("Input radius ");
		r = sc.nextDouble();
		System.out.println("Input coordinate X");
		x = sc.nextDouble();
		System.out.println("Input coordinate Y");
		y = sc.nextDouble();

		gipotenuza = Math.sqrt(x * x + y * y);
		if (r >= gipotenuza) {
			System.out.println("Point belongs to circle");
		} else {
			System.out.println("Point does not belong to circle");
		}
		sc.close();
	}

}
