package home_work;

import java.util.Scanner;

public class Utils {
	// Hàm nhập chuỗi thông thường
	public static String getInput(Scanner scanner, String prompt) {
		System.out.print(prompt);
		return scanner.nextLine().trim();
	}

	// Hàm nhập câu trả lời yes/no -> trả về boolean
	public static boolean getYesNoInput(Scanner scanner, String prompt) {
		System.out.print(prompt);
		String response = scanner.nextLine().trim().toLowerCase();
		return response.equals("có") || response.equals("yes") || response.equals("y") || response.equals("Y")
				|| response.equals("YES");
	}
}
