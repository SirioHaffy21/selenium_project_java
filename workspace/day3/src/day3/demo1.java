package day3;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số cần kiểm tra: ");
		double number = scanner.nextDouble();
		checkNumber(number);
		showDay((int) number);
	}

	public static void checkNumber(double number) {
		String result = (int) (number) % 2 == 0 ? number + " là số chẵn." : number + " là số lẻ";
		System.out.println(result);
	}

	public static void showDay(int number) {
		String result;
		switch (number) {
		case 2:
			result = "Monday";
			break;
		case 3:
			result = "Tuesday";
			break;
		case 4:
			result = "Wednesday";
			break;
		case 5:
			result = "Thursday";
			break;
		case 6:
			result = "Friday";
			break;
		case 7:
			result = "Saturday";
			break;
		case 8:
			result = "Sunday";
			break;

		default:
			result = "invalid";
		}

		System.out.println(result);
	}

}
