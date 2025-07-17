package day4;

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XeObj xeMay = new XeObj();
		xeMay.setTenXe("Honda");
		xeMay.setLoaiXe("Vision");
		xeMay.setVanTocMax("120 km/h");

		System.out.println("Phương tiện: " + xeMay.getTenXe() + ", thuộc loại: " + xeMay.getLoaiXe()
				+ ", có thể đạt đến: " + xeMay.getVanTocMax());

		XeObj xeTaxi = new XeObj();
		xeTaxi.setTenXe("Kia Morning");
		xeTaxi.setLoaiXe("Vinfast");
		xeTaxi.setVanTocMax("200 km/h");

		System.out.println("Phương tiện: " + xeTaxi.getTenXe() + ", thuộc loại: " + xeTaxi.getLoaiXe()
				+ ", có thể đạt đến: " + xeTaxi.getVanTocMax());
	}
	// nhận xét salarry

}
