package net.ukr.green_dream;

public class MainD {

	public static void main(String[] args) {
		String a = "What a beautifull world!";
		int c = calculateWords(a);
		System.out.println("There are " + c + " words in this phrase.");

	}

	public static int calculateWords(String a) {
		char[] array = a.toCharArray();
		int sum = 1;
		for (char c : array) {
			if (c == ' ') {
				sum++;
			}

		}

		return sum;

	}

}
