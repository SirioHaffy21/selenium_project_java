package day5_3;

public class Add {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Tổng 2 số 5 và 7: " + add(5, 7));
		System.out.println("-----------");
		System.out.println("Tổng 2 số 6.5 và 8.9: " + add(6.5, 8.9));
	}
}
