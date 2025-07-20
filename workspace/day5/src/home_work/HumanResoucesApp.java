package home_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanResoucesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<BA> lBas = new ArrayList<BA>();
		List<Developer> lDevelopers = new ArrayList<Developer>();
		List<Tester> lTesters = new ArrayList<Tester>();
		Developer dev = new Developer();
		Tester tester = new Tester();
		BA ba = new BA();
		int count1 = 0;
		System.out.println("-----------------------------------");
		System.out.println("Menu hệ thống nhập dữ liệu danh sách nhân viên công ty.");
		System.out.println("1. Nhập thông tin Developer.");
		System.out.println("2. Nhập thông tin Tester.");
		System.out.println("3. Nhập thông tin BA.");
		System.out.println("4. Hiển thị danh sách các phòng ban.");
		System.out.println("Các số khác. Thoát chương trình.");
		do {
			System.out.print("Chọn chức năng: ");
			count1 = Integer.parseInt(scanner.nextLine());
			switch (count1) {
			case 1:
				Repository.inputDeveloper(lDevelopers);
				break;
			case 2:
				Repository.inputTester(lTesters);
				break;
			case 3:
				Repository.inputBA(lBas);
				break;
			case 4:
				Repository.showEmployees(lBas, lDevelopers, lTesters, dev, tester, ba);
				break;
			default:
				System.out.println("Thoát chương trình. Chọn 1/2/3/4 để sử dụng các chức năng");
				break;
			}
		} while (count1 == 1 || count1 == 2 || count1 == 3 || count1 == 4);

	}

}
