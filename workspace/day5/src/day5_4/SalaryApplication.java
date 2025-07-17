package day5_4;

public class SalaryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary salary = new Salary();
		System.out.println("Lương cơ bản 4 tham số: " + String.format("%.2f", salary.tinhLuong(10000000, 2, 1.5, 1)));
		System.out.println("Lương cơ bản 3 tham số: " + String.format("%.2f", salary.tinhLuong(10000000, 2, 1.5)));
		System.out.println("Lương cơ bản 2 tham số: " + String.format("%.2f", salary.tinhLuong(10000000, 2)));
	}

}
