package home_work;

import java.util.List;
import java.util.Scanner;

public class BA extends Employee {
	String level;
	String category;
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
		return (isLeader ? "BA " : "") + "Developer: code: " + super.getCccd() + ", name: " + super.getName()
				+ ", debut: " + super.getDateDebut() + ", salary in month: " + super.getSalary() + ". Position: "
				+ (level != null ? level : "") + " " + (category != null ? category : "");
	}

	void inputBA(List<BA> baList) {
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

	void showBAs(List<BA> lBas) {
		System.out.println("=================BA=================");
		if (lBas.size() > 0) {
			for (BA ba1 : lBas) {
				System.out.println(ba1.toString());
			}
		} else {
			System.out.println("null");
		}
	}
}
