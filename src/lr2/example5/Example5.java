package lr2.example5;

public class Example5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 5);
        rectangle1.setLength(4);
        System.out.println("Длина: " + rectangle1.getLength());
        System.out.println("Ширина: " + rectangle1.getWidth());
        System.out.println("Площадь: " + rectangle1.squareRectangle());
        System.out.println("Периметр: " + rectangle1.perimeterRectangle());
    }
}
