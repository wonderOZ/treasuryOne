package net.ukr.green_dream;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Input 5-digit number and press Enter ");
		int number = sc.nextInt();
		int digitOne=number/10000;
		int digitTwo=number%10000/1000;
		int digitThree=number%10000%1000/100;
		int digitFour=number%10000%1000%100/10;
		int digitFive=number%10000%1000%100%10;
		
		System.out.println(digitOne);
		System.out.println(digitTwo);
		System.out.println(digitThree);
		System.out.println(digitFour);
		System.out.println(digitFive);
		sc.close();
	}

}
