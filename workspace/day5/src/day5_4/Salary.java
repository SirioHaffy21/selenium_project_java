package day5_4;

public class Salary {
	/*
	 *
	 *
	 *
	 */

	public double tinhLuong(int luongCoBan, double heSoLuong, double soNamKN, int loaibs) {
		switch (loaibs) {
		case 1: {

			return luongCoBan * heSoLuong * soNamKN + luongCoBan * 0.2;
		}
		case 2: {

			return luongCoBan * heSoLuong * soNamKN + luongCoBan * 0.45;
		}
		default:
			System.out.println("Loại bác sĩ không hợp lệ!");
		}
		return luongCoBan;
	}

	public double tinhLuong(int luongCoBan, double heSoLuong, double soNamKN) {
		return luongCoBan * heSoLuong * soNamKN;
	}

	public double tinhLuong(int luongCoBan, double heSoLuong) {
		return luongCoBan * heSoLuong;
	}

}
