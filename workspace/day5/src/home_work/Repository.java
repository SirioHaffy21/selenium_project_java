package home_work;

import java.util.List;
import java.util.Scanner;

public class Repository {

	public static void showEmployees(List<BA> lBas, List<Developer> lDevelopers, List<Tester> lTesters, Developer dev,
			Tester tester, BA ba) {
		showDeveloper(lDevelopers);
		showTester(lTesters);
		showBAs(lBas);
	}

	private static void showDeveloper(List<Developer> lDevelopers) {
		System.out.println("=============Developer==============");
		if (lDevelopers.size() > 0) {
			for (Developer dev1 : lDevelopers) {
				System.out.println(dev1.toString());
			}
		} else {
			System.out.println("null");
		}
	}

	private static void showTester(List<Tester> lTesters) {
		System.out.println("===============Tester===============");
		if (lTesters.size() > 0) {
			for (Tester tester1 : lTesters) {
				System.out.println(tester1.toString());
			}
		} else {
			System.out.println("null");
		}
	}

	private static void showBAs(List<BA> lBas) {
		System.out.println("=================BA=================");
		if (lBas.size() > 0) {
			for (BA ba1 : lBas) {
				System.out.println(ba1.toString());
			}
		} else {
			System.out.println("null");
		}
	}

	public static void inputDeveloper(List<Developer> developerList) {
		Scanner scanner = new Scanner(System.in);
		Developer developer = new Developer();

		System.out.println("- Thêm mới Developer.");

		String cccd = Utils.getInput(scanner, "\tNhập CCCD: ");
		developer.setCccd(cccd);

		String name = Utils.getInput(scanner, "\tNhập tên nhân viên: ");
		developer.setName(name);

		String dateDebut = Utils.getInput(scanner, "\tNhập ngày vào công ty: ");
		developer.setDateDebut(dateDebut);

		String category = Utils.getInput(scanner, "\tNhập loại dev (Backend/Frontend/FullStack/AI/...): ");
		developer.setCategory(category);

		String languageCode = Utils.getInput(scanner, "\tChọn ngôn ngữ lập trình của bạn: ");
		developer.setLanguageCode(languageCode);

		String level = Utils.getInput(scanner, "\tNhập trình độ nhân viên (Intern/Fresher/Junior/...): ");
		developer.setLevel(level);

		boolean isLeader = Utils.getYesNoInput(scanner, "\tBạn có phải Leader không? (có/không)(yes/no)(y/n): ");
		developer.setLeader(isLeader);

		developerList.add(developer);

		System.out.println("------------------------");
		System.out.println("Thêm mới dev thành công.");
		System.out.println("------------------------");
	}

	public static void inputBA(List<BA> baList) {
		Scanner scanner = new Scanner(System.in);
		BA ba = new BA();

		System.out.println("- Thêm mới BA.");

		String cccd = Utils.getInput(scanner, "\tNhập CCCD: ");
		ba.setCccd(cccd);

		String name = Utils.getInput(scanner, "\tNhập tên nhân viên: ");
		ba.setName(name);

		String dateDebut = Utils.getInput(scanner, "\tNhập ngày vào công ty: ");
		ba.setDateDebut(dateDebut);

		String category = Utils.getInput(scanner, "\tNhập loại BA (Management/System/Data): ");
		ba.setCategory(category);

		String level = Utils.getInput(scanner, "\tNhập trình độ nhân viên (Intern/Fresher/Junior/...): ");
		ba.setLevel(level);

		boolean isLeader = Utils.getYesNoInput(scanner, "\tBạn có phải Leader không? (có/không)(yes/no)(y/n): ");
		ba.setLeader(isLeader);

		baList.add(ba);

		System.out.println("------------------------");
		System.out.println("Thêm mới BA thành công.");
		System.out.println("------------------------");
	}

	public static void inputTester(List<Tester> testerList) {
		Scanner scanner = new Scanner(System.in);
		Tester tester = new Tester();

		System.out.println("- Thêm mới Tester.");

		String cccd = Utils.getInput(scanner, "\tNhập CCCD: ");
		tester.setCccd(cccd);

		String name = Utils.getInput(scanner, "\tNhập tên nhân viên: ");
		tester.setName(name);

		String dateDebut = Utils.getInput(scanner, "\tNhập ngày vào công ty: ");
		tester.setDateDebut(dateDebut);

		String category = Utils.getInput(scanner, "\tNhập loại tester (Manual/Automation/Performance/AI/...): ");
		tester.setCategory(category);

		String level = Utils.getInput(scanner, "\tNhập trình độ nhân viên (Intern/Fresher/Junior/...): ");
		tester.setLevel(level);

		boolean isLeader = Utils.getYesNoInput(scanner, "\tBạn có phải Leader không? (có/không)(yes/no)(y/n): ");
		tester.setLeader(isLeader);

		testerList.add(tester);

		System.out.println("------------------------");
		System.out.println("Thêm mới tester thành công.");
		System.out.println("------------------------");
	}

}
