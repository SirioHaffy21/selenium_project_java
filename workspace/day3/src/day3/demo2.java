package day3;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showAndSumEvenNumber();
		System.out.println("");
		int[] array = inputArray();
		showAllNunberDivideBy5(array);
	}

	public static void showAndSumEvenNumber() {
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + ", ");
			sum += i;
		}
		System.out.println("\nTổng các số chẵn là: " + sum);
	}

	public static int[] inputArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng: ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		System.out.println("Nhập các giá trị của mảng: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}
		System.out.println("Các số chia hết cho 5 là: ");

		return array;
	}

	public static void showAllNunberDivideBy5(int[] array) {

		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0) {
				System.out.print(array[i] + " - ");
				result[i] = array[i];
			} else {
				continue;
			}
		}

		System.out.println("");
		System.out.println("Mảng các số chia hết cho 5 là: ");
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0)
				System.out.print(result[i] + ", ");
		}
	}
}
