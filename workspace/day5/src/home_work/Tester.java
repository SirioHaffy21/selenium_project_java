package home_work;

import java.util.List;
import java.util.Scanner;

public class Tester extends Employee {
	String category;// Manual, Auto, Performance, AI...
	String level;
	boolean isLeader;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public boolean isLeader() {
		return isLeader;
	}

	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}

	@Override
	public String toString() {
		return (isLeader ? "LEADER " : "") + "Developer: code: " + super.getCccd() + ", name: " + super.getName()
				+ ", debut: " + super.getDateDebut() + ", Salary in month: " + super.getSalary() + ". Position: "
				+ (level != null ? level : "") + " " + (category != null ? category : "");
	}

	void inputTester(List<Tester> testerList) {
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

	void showTester(List<Tester> lTesters) {
		System.out.println("===============Tester===============");
		if (lTesters.size() > 0) {
			for (Tester tester1 : lTesters) {
				System.out.println(tester1.toString());
			}
		} else {
			System.out.println("null");
		}
	}

}
