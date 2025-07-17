package day5_4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thêm mới Developer.");
		System.out.print("Nhập CCCD: ");
		String cccd = scanner.nextLine();
		System.out.print("Nhập tên nhân viên: ");
		String name = scanner.nextLine();
		System.out.print("Nhập ngày vào công ty: ");
		String debut = scanner.nextLine();
		System.out.print("Nhập loại dev(Backend/Frontend/FullStack/AI/...): ");
		String category = scanner.nextLine();
		System.out.print("Chọn ngôn ngữ lập trình của bạn: ");
		String languageCode = scanner.nextLine();
		System.out.print("Nhập trình độ nhân viên(Intern/Fresher/Junior/....): ");
		String level = scanner.nextLine();
		System.out.print("Bạn có phải Leader không? (có/không)");
		String leader = scanner.nextLine();
	}

}
