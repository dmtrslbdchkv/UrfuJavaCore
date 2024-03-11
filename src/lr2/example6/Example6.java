package lr2.example6;

public class Example6 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());
        Square square = new Square(4);
        System.out.println("Площадь квадрата: " + square.area());
        System.out.println("Периметр квадрата: " + square.perimeter());
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
    }
}
