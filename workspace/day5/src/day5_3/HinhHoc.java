package day5_3;

public abstract class HinhHoc {
	public String tenHinh;

	public String getTenHinh() {
		return tenHinh;
	}

	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}

	public abstract double tinhDienTich();

}
