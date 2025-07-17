package day5_3;

public class HinhTron extends HinhHoc {

	private int banKinh;

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return 3.14 * banKinh;
	}

	public String getInfo() {
		return super.tenHinh + " có bán kính là: " + banKinh;
	}

	public int getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}

}
