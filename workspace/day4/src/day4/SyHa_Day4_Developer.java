package day4;

public class SyHa_Day4_Developer extends SyHa_Day4_Employee {

	/**
	 *
	 */
	public SyHa_Day4_Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param employee_id
	 * @param employee_name
	 * @param employee_salary
	 */
	public SyHa_Day4_Developer(String employee_id, String employee_name, double employee_salary) {
		super(employee_id, employee_name, employee_salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyHa_Day4_Employee firstEmployee = new SyHa_Day4_Developer();
		firstEmployee.setEmployee_id("em123");
		firstEmployee.setEmployee_name("Tom");

		System.out.println("Developer 1: \n\tID: " + firstEmployee.getEmployee_id() + ", Name: "
				+ firstEmployee.getEmployee_name() + ", Salary: " + firstEmployee.getEmployee_salary());

		SyHa_Day4_Employee secondEmployee = new SyHa_Day4_Employee();
		secondEmployee.setEmployee_id("em456");
		secondEmployee.setEmployee_name("Jerry");

		System.out.println("Developer 2: \n\tID: " + secondEmployee.getEmployee_id() + ", Name: "
				+ secondEmployee.getEmployee_name() + ", Salary: " + secondEmployee.getEmployee_salary());

	}
	// Nhận xét về salary:
	// - Khi get giá trị salary thì hiển thị 0/null/0.0 nếu như không có hàm set giá
	// trị cho salary

}
