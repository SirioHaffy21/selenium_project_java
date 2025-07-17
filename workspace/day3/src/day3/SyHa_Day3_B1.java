package day3;

import java.util.Scanner;

public class SyHa_Day3_B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng: ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		System.out.println("Nhập các giá trị của mảng: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		sortASC_Array(array);
		sortDESC_Array(array);
	}

	public static void sortASC_Array(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("\nSau khi sắp xếp tăng dần.");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void sortDESC_Array(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("\nSau khi sắp xếp giảm dần.");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
