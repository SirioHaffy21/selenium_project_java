package day5_3;

public class HinhHocApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron tron = new HinhTron();
		tron.setTenHinh("Hình tròn A");
		tron.setBanKinh(30);
		System.out.println("Thông tin hình là: " + tron.getInfo());
		System.out.println("Diện tích hình là: " + tron.tinhDienTich());

		System.out.println("-----------------");

		HinhVuong vuong = new HinhVuong();
		vuong.setTenHinh("Hình vuông A");
		vuong.setCanh(40);
		System.out.println("Thông tin hình là: " + vuong.getInfo());
		System.out.println("Diện tích hình là: " + vuong.tinhDienTich());
	}

}
