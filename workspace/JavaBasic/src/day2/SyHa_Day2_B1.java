package day2;

import java.util.Scanner;

public class SyHa_Day2_B1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		String input = "";

		do {
			System.out.print("Số bạn cần kiểm tra: ");
			input = scanner.nextLine();
			try {
				number = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Lỗi: số bạn nhập không phải là số nguyên.");
			}
		} while (true);
		findOldOrEven(number);
	}

	public static void findOldOrEven(int number) {
		if (number % 2 == 0)
			System.out.println(number + " là số chẵn. ");
		else
			System.out.println(number + " là số lẻ. ");
	}
}
