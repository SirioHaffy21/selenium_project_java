package training_abstract;

public class Rectangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw: " + super.getColor() + " rectangle.");
	}
}
