package net.ukr.green_dream;

public class MainC {

	public static void main(String[] args) {
		int array[] = { 3, 5, 8, 25, 8, -33, 6, 99, 0, 65 };
		int a = 25;

		int index = findIndex(array, a);
		System.out.println("Index is " + index);

	}

	public static int findIndex(int[] array, int a) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (a == array[i]) {
				index = i;
				break;
			}

		}
		return index;
	}
}