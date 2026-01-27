package module_3_1.shape;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n");

        Shape[] shapes = {
                new Circle(5.0, "red"),
                new Rectangle(4.0, 6.0, "blue"),
                new Triangle(3.0, 8.0, "green")
        };
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
