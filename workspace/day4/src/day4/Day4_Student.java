package day4;

public class Day4_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4_Person paulStudent = new Day4_Person();
		paulStudent.setName("Paul Marker");
		paulStudent.setAge(18);
		paulStudent.setPhoneNumber("115");
		System.out.println("Họ tên: " + paulStudent.getName() + ", Tuổi: " + paulStudent.getAge() + ", Số điện thoại: "
				+ paulStudent.getPhoneNumber());
		Day4_Person peterStudent = new Day4_Person();
		peterStudent.setName("Peter Parker");
		peterStudent.setAge(28);
		peterStudent.setPhoneNumber("114");
		System.out.println("Họ tên: " + peterStudent.getName() + ", Tuổi: " + peterStudent.getAge() + ", Số điện thoại: "
				+ peterStudent.getPhoneNumber());
	}

}
