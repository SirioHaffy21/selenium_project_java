package on_class;

public abstract class Person {
	private String name;
	private long cCCD;
	private int age;
	private String address;
	private double height;
	private double weight;

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public long getcCCD() {
		return cCCD;
	}

	public void setcCCD(long cCCD) {
		this.cCCD = cCCD;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void diChoi() {
		System.out.println("Đi chơi khi có tiền.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cCCD=" + cCCD + ", age=" + age + ", address=" + address + ", height="
				+ height + ", weight=" + weight + "]";
	}


}
