package on_class;

public class GiaoVien extends Person {
	// thuộc tính riêng của Giáo Viên
	private String id;
	private String chuyenMon;
	private String nganh;

	/**
	 *
	 */
	public GiaoVien() {
		super();
	}

	/**
	 * @param id
	 * @param chuyenMon
	 * @param nganh
	 */
	public GiaoVien(String id, String chuyenMon, String nganh) {
		super();
		this.id = id;
		this.chuyenMon = chuyenMon;
		this.nganh = nganh;
	}

	@Override
	public void diChoi() {
		// TODO Auto-generated method stub
		System.out.println("Đi chơi vào ngày nghỉ, sau khi đi dạy hoặc đi coi thi.");
	}

	// Phương thức riêng của giáo viên
	public void diDay() {
		System.out.println("Nay có lịch dạy, cần triển khai.");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public void printInfo() {
		System.out.println(super.getName() + ", id: " + id + ", " + super.getAge() + ". cccd: " + super.getcCCD() + ", địa chỉ: "
				+ super.getAddress() + ", chuyen mon: " + chuyenMon);
	}

}
