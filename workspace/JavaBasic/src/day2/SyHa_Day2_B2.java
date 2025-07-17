package day2;

import java.util.Scanner;

public class SyHa_Day2_B2 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		String input = "", elementInput = "";
		int lengthArray = 0, countLength = 0, countElement = 0;
		System.out.println("Bạn có 3 lần nhập độ dài mảng, hãy nhập sao cho hợp lý.");
		System.out.println("=======================================================");
		do {
			System.out.print("Nhập độ dài mảng: ");
			input = scanner.nextLine();
			//int lengthArray = scanner.nextInt();
			try {
				lengthArray = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Lỗi: độ dài mảng bạn nhập không phải là số nguyên");
				System.out.println("Còn " + (3 - 1 - countLength) + " lượt nhập");
				countLength++;
				if (countLength == 3) {
					System.out.println("Hết lượt nhập.");
					System.exit(0);
				}
			}
		} while (true);


		int[] arraySH = new int[lengthArray];
		System.out.println("Nhập các phần tử trong mảng. (3 lần nhập mỗi phần tử, nếu nhập sai)");
		for (int i = 0;i < lengthArray;i++) {
			do {
				System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
				elementInput = scanner.nextLine();

				try {
					arraySH[i] = Integer.parseInt(elementInput);
					break;
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Lỗi: phần tử thứ " + (i + 1) + " bạn nhập không phải là số nguyên.");
					System.out.println("Còn " + (3 - 1 - countElement) + " lượt nhập");
					countElement++;
					if (countElement == 3) {
						System.out.println("Hết lượt nhập.");
						System.exit(0);
					}
				}
			} while (true);
		}

		int totalElementArray = getSumArray(arraySH);
		System.out.println("Tổng các phần tử trong mảng là: " + totalElementArray);
	}

	public static int getSumArray(int[] array) {
		int sum = 0;
		for (int i = 0;i < array.length;i++) {
			sum += array[i];
		}
		return sum;
	}
}
