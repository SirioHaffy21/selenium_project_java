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
		String select = "";
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
			select = scanner.nextLine();
			count1 = Integer.parseInt(select);
			switch (count1) {
			case 1:
				dev.inputDeveloper(lDevelopers);
				break;
			case 2:
				tester.inputTester(lTesters);
				break;
			case 3:
				ba.inputBA(lBas);
				break;
			case 4:
				showEmployees(lBas, lDevelopers, lTesters, dev, tester, ba);
				break;
			default:
				System.out.println("Hãy nhập lại số 1/2/3/4.");
				break;
			}
		} while (count1 == 1 || count1 == 2 || count1 == 3 || count1 == 4);

	}

	private static void showEmployees(List<BA> lBas, List<Developer> lDevelopers, List<Tester> lTesters, Developer dev, Tester tester, BA ba) {
		dev.showDeveloper(lDevelopers);
		tester.showTester(lTesters);
		ba.showBAs(lBas);
	}

}
