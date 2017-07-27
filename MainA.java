package net.ukr.green_dream;

public class MainA {
	public static void main(String[] args) {
		String a = "Hello world ";
		double d = 3.5;
		int g = -2;
		String b = concatenateParts(g, d, a);
		System.out.println(b);

	}

	public static String concatenateParts(int g, double d, String a) {
		String sum = a + (d + g);
		return sum;
	}

}
