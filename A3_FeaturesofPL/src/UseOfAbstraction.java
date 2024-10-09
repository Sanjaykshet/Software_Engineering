// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract double getArea();

}

// child class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class UseOfAbstraction {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
        System.out.println("Area: " + circle.getArea());
	}
}
