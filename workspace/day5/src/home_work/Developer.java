package home_work;
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

}
