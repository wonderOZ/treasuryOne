package net.ukr.green_dream;

import java.util.Arrays;

public class MainTwoB {

	public static void main(String[] args) {
		int[] array = { 7, 2, 9, 4 };
		int a = 0;
		int b = 0;

		for (int i = 0; i < ((array.length - 1) / 2 + 1); i++) {
			a = array[i];
			b = array[(array.length - 1 - i)];
			array[i] = b;
			array[(array.length - 1 - i)] = a;

		}
		System.out.println(Arrays.toString(array));
	}
}