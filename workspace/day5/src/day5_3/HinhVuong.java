package day5_3;

public class HinhVuong extends HinhHoc {
	private int canh;

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return canh * canh;
	}

	public String getInfo() {
		return super.tenHinh + " có canh là: " + canh;
	}

	public int getCanh() {
		return canh;
	}

	public void setCanh(int canh) {
		this.canh = canh;
	}

}
