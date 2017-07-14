package net.ukr.green_dream;

import java.util.Scanner;

public class AppartmentsFloorEntrance {
/* There are 9 floors, 4 entrances, 4 rooms at each floor.
 * User input room number from keyboard.
 * Program returns entrance & floor.  
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roomNumber;
		int floor;
		int entrance;

		System.out.print("Input room number and press Enter ");
		roomNumber = sc.nextInt();

		if (1 <= roomNumber && roomNumber <= 36) {
			entrance = 1;
			floor = (roomNumber - 1) / 4 + 1;
			System.out.println("Entrance :" + entrance);
			System.out.println("Floor :" + floor);
		}

		if (37 <= roomNumber && roomNumber <= 72) {
			entrance = 2;
			floor = (roomNumber - 37) / 4 + 1;
			System.out.println("Entrance :" + entrance);
			System.out.println("Floor :" + floor);
		}

		if (73 <= roomNumber && roomNumber <= 108) {
			entrance = 3;
			floor = (roomNumber - 73) / 4 + 1;
			System.out.println("Entrance :" + entrance);
			System.out.println("Floor :" + floor);
		}

		if (109 <= roomNumber && roomNumber <= 144) {
			entrance = 4;
			floor = (roomNumber - 109) / 4 + 1;
			System.out.println("Entrance :" + entrance);
			System.out.println("Floor :" + floor);
		}

		if (0 >= roomNumber || roomNumber > 144) {
			System.out.println("There is no room with number " + roomNumber
					+ " in this house!");
		}

		sc.close();
	}

}
