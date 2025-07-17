package on_class;

public class ClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiaoVien gv = new GiaoVien();
		gv.setAddress("Hà Nội");
		gv.setcCCD(1234648978);
		gv.setName("Nguyễn Văn A");
		gv.setAge(25);
		gv.setChuyenMon("Toán");
		gv.setId("gv1234");
		gv.printInfo();
		gv.diChoi();
		gv.diDay();

		System.out.println("------------------------");

		SinhVien sv = new SinhVien();
		sv.setAddress("Hà Nội");
		sv.setcCCD(1234648978);
		sv.setName("Nguyễn Văn A");
		sv.setAge(25);
		sv.setId("sv123");
		sv.setGPA(3.9);
		sv.setSoTinChi(4);
		sv.printInfo();
		sv.diChoi();
		sv.diHoc();
	}

}
