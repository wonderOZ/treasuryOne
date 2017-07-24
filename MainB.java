package net.ukr.green_dream;

import java.util.Arrays;

public class MainB {

	public static void main(String[] args) {
		
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100.0);
		}

		int [] b = Arrays.copyOf(array, 30);
		for (int i = 15; i < b.length; i++) {
			b [i]= b [(i-15)]*2;
		}
	
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b));
		}

}
