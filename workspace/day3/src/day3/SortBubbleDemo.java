package day3;

import java.util.Scanner;

public class SortBubbleDemo {

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

		sortArray(array);
	}

	public static void sortArray(int[] array) {
		int temp;
		// 5 9 100 45 8
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				System.out.println("So sánh giữa " + (array[j]) + " và " + (array[j + 1]) + ". ");
				if (array[j] > array[j + 1]) {
					System.out.println("Hoán đổi " + (array[j]) + " và " + (array[j + 1]) + ". ");
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("\nSau khi sắp xếp.");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
