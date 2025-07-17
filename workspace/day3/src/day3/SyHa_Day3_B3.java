package day3;

import java.util.Scanner;

public class SyHa_Day3_B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMinNumberIntegerArray();
		System.out.println("-----------------------------");
		findMaxNumberDoubleArray();
	}

	public static void findMinNumberIntegerArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng số nguyên: ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		System.out.println("Nhập các số nguyên của mảng: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		System.out.println("Giá thị nhỏ nhất là: " + findMin(array));
	}

	public static void findMaxNumberDoubleArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng số thập phân: ");
		int number = scanner.nextInt();
		double[] array = new double[number];
		System.out.println("Nhập các số thập phân của mảng: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		System.out.println("Giá thị lớn nhất là: " + findMax(array));
	}

	public static double findMax(double[] array) {
		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int findMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
