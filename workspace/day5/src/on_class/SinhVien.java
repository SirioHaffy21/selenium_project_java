package on_class;

public class SinhVien extends Person {
	// thuộc tính riêng của Sinh Viên
	private String id;
	private int soTinChi;
	private double GPA;


	/**
	 *
	 */
	public SinhVien() {
		super();
	}

	/**
	 * @param id
	 * @param soTinChi
	 */
	public SinhVien(String id, int soTinChi, double GPA) {
		super();
		this.id = id;
		this.soTinChi = soTinChi;
		this.GPA = GPA;
	}

	@Override
	public void diChoi() {
		// TODO Auto-generated method stub
		System.out.println("Đi chơi net sau khi thi xong.");
	}

	public void diHoc() {
		System.out.println("Thứ 2 đến thứ 7 là đi học.");
	}
	// Phương thức riêng của sinh viên
	public void diThi() {
		System.out.println("Sinh viên đi thi giữa kỳ và cuối kỳ");
	}

	//
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b, double c) {
		return a + b - c;
	}

	public void printInfo() {
		System.out.println(super.getName() + ", id: " + id + ", " + super.getAge() + ". cccd: " + super.getcCCD() + ", địa chỉ: "
				+ super.getAddress() + ", gpA: " + GPA + ", so tin chi: "+ soTinChi);
	}

}
