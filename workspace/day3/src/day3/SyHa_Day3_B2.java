package day3;

import java.util.Scanner;

public class SyHa_Day3_B2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findNumberDivisibleBy2And3();
	}

	public static void findNumberDivisibleBy2And3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bạn có 20 lần nhập số để tìm ra số chia hết cho 2 và 3.");
		int count = 1;
		int number;
		while (true) {
			System.out.print("Nhập lần " + (count) + ": ");
			number = scanner.nextInt();
			if (number % 3 == 0 && number % 2 == 0) {
				System.out.println("Số thỏa mãn. Số bạn vừa nhập là: " + number);
				break;
			}
			if (count == 20) {
				System.out.println("Không tìm thấy số thoả mãn!");
				break;
			}
			count++;
		}
	}
}
