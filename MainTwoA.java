package net.ukr.green_dream;

public class MainTwoA {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
		int a = 0;
		int b = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = (array[0].length - (array[0].length - i)); j < array[0].length; j++) {
				a = array[i][j];
				b = array[j][i];

				array[i][j] = b;
				array[j][i] = a;

			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
