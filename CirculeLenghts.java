package net.ukr.green_dream;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input radius and press Enter ");

		double radius = sc.nextDouble();
		double l;
		l = 2 * radius * Math.PI;
		System.out.println("Circule lenghts is: " + l);
		sc.close();
	}

}
