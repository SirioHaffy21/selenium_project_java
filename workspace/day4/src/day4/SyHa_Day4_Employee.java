package day4;

public class SyHa_Day4_Employee {
	private String employee_id;
	private String employee_name;
	private double employee_salary;

	public SyHa_Day4_Employee() {
	}

	public SyHa_Day4_Employee(String employee_id, String employee_name, double employee_salary) {

		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

}
