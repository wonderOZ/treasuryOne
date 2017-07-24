package net.ukr.green_dream;

import java.util.Arrays;
import java.util.Scanner;

public class MainA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input quantity of array's members and press Enter. ");
		int q = sc.nextInt();
		
		int [] array = new int [q];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Input array member number "+i+" and press Enter.");
			array [i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
sc.close();
	}

}
