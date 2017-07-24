package net.ukr.green_dream;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		int count = 0;
		char b = 'b';
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text and press Enter");
		String a = sc.nextLine();
		char[] array = a.toCharArray();
		for (char c : array) {
			if (c == b) {
				count++;
			}

		}
		sc.close();
		System.out.println("There are " + count + " symbols " + b + " in your text");
	}

}
