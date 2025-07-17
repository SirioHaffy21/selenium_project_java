package day4;

public class Day4_Person {

	private String name;
	private int age;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Day4_Person [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}
