package home_work;

import java.util.List;
import java.util.Scanner;

public class Developer extends Employee {
	String category; // FullStack, Backend, Frontend, AI
	String languageCode;
	String level;
	boolean isLeader;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
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
				+ (level != null ? level : "") + " " + (category != null ? category : "") + " "
				+ (languageCode != null ? languageCode : "");
	}

	void inputDeveloper(List<Developer> developerList) {
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

	void showDeveloper(List<Developer> lDevelopers) {
		System.out.println("=============Developer==============");
		if (lDevelopers.size() > 0) {
			for (Developer dev1 : lDevelopers) {
				System.out.println(dev1.toString());
			}
		} else {
			System.out.println("null");
		}
	}

}
