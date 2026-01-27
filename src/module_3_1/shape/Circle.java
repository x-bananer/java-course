package module_3_1.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Area of Circle with radius " + radius + ": " + calculateArea() + ", color: " + getColor();
    }
}
