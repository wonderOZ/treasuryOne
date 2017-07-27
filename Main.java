package net.ukr.green_dream;

public class Main {

	public static void main(String[] args) {
		int array[] = { 3, 5, 8, 25, 8, -33, 6, 99, 0, 65 };
		int max = 0;
		max = findMax(array, max);
		System.out.println("Max is " + max);

	}

	public static int findMax(int[] array, int max) {
		max = array[0];
		for (int member : array) {
			if (member > max) {
				max = member;
			}
		}
		return max;
	}
}
