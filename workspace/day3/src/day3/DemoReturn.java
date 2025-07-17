package day3;

import java.util.Scanner;

public class DemoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("input months experience: ");
		int sothang = scanner.nextInt();
		System.out.println("Level: " + level(sothang));
	}

	public static String level(int sothang) {
		if (sothang > 0 && sothang < 6) {
			return "fresher";
		} else if (sothang >= 6 && sothang <= 24) {
			return "junior";
		} else {
			return "senior";
		}
	}

}
