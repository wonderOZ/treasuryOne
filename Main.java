package net.ukr.green_dream;

public class Main {

	public static void main(String[] args) {
		int[] array = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int count = 0;
		for (int i : array) {
			if (i % 2 > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}