package home_work;

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

}
