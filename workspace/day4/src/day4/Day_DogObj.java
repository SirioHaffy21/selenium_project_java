package day4;

import java.util.Scanner;

public class Day_DogObj {

	// Attribute
	String breed;
	String size;
	double age;
	String color;

	public String get_info() {
		return "Breed is: " + breed + ", Size: " + size + ", Age: " + age + ", Color: " + color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner scanner = new Scanner(System.in);
		Day_DogObj dogObj = new Day_DogObj();
		System.out.print("Nhập giống chó: ");
		dogObj.breed = scanner.nextLine();
		System.out.print("Nhập kích cỡ: ");
		dogObj.size = scanner.nextLine();
		System.out.print("Nhập tuổi: ");
		dogObj.age = scanner.nextDouble();
		System.out.print("Nhập màu: ");
		dogObj.color = scanner.next();

		System.out.println(dogObj.get_info());
	}

}
