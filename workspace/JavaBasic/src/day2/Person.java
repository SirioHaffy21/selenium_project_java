package day2;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Họ và tên: Nguyễn Sỹ Hà");
		System.out.println("Emai: nsh@gmail.jp");
		System.out.println("Điện thoại: +84231456777");

		Scanner scanner = new Scanner(System.in);

		int numberOne, numberTwo;
		System.out.print("Input first Number: ");
		numberOne = scanner.nextInt();
		System.out.print("Input second Number: ");
		numberTwo = scanner.nextInt();

		printLargeNumber(numberOne, numberTwo);
		calculater();
	}

	// Hàm với 2 tham số truyển vào (number1, number2)
	public static void printLargeNumber(int firstNumber, int secondNumber)
	{
		if (firstNumber > secondNumber) {
			System.out.println("Số lớn hơn là: " + firstNumber);
		} else
			System.out.println("Số lớn hơn là: " + secondNumber);
	}

	public static void calculater() {
		double result = 0;
		result = (1123 * 6745)/500;
		System.out.println("Result: " + result);
	}
}
