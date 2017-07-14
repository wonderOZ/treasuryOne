package net.ukr.green_dream;

public class TriangleArea {

	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c = 5;
		double p;
		double triangleArea;

		p = (a + b + c) / 2;
		triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Triangle area: " + triangleArea);

	}

}
