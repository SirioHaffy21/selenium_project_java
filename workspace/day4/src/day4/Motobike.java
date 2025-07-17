package day4;

public class Motobike {

	private String hang;
	String color;
	String bienSo;
	String ngayDangKy;

	public String get_info() {
		return "Hãng xe: " + hang + "," + " Màu: " + color + ", " + "Biển số: " + bienSo + ", " + "Ngày đăng ký: "
				+ ngayDangKy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Motobike motobike = new Motobike();
		motobike.hang = "SH";
		motobike.color = "Blue";
		motobike.bienSo = "29A-123.45";
		motobike.ngayDangKy = "22-12-2024";

		System.out.println(motobike.get_info());

		Motobike motobike1 = new Motobike();
		motobike1.hang = "Wave";
		motobike1.color = "Black";
		motobike1.bienSo = "29A-123.44";
		motobike1.ngayDangKy = "21-11-2024";

		System.out.println(motobike1.get_info());

		Motobike motobike2 = new Motobike();
		motobike2.hang = "Vision";
		motobike2.color = "Gold";
		motobike2.bienSo = "39A-103.45";
		motobike2.ngayDangKy = "22-02-2025";

		System.out.println(motobike2.get_info());
	}

}
