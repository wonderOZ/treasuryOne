package net.ukr.green_dream;

public class MainB {

	public static void main(String[] args) {
		int a = 6;
		int b = 4;
		drawRectangle(a, b);

	}

	public static void drawRectangle(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
