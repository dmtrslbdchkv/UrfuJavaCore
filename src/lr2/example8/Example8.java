package lr2.example8;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Лайка", 3, "Рот", "Лабрадор");
        dog.setAge(4);
        System.out.printf("Name: %s, age: %d, method: %s, breed: %s \n\n", dog.getName(), dog.getAge(), dog.getSoundMethod(), dog.getBreed());

        Cat cat = new Cat("Вася", 2, "Рот", "Сухой корм");
        cat.setFoodType("Влажный корм");
        System.out.printf("Name: %s, age: %d, method: %s, foodType: %s \n\n", cat.getName(), cat.getAge(), cat.getSoundMethod(), cat.getFoodType());

        Bird bird = new Bird("Кеша", 1, "Рот", true);
        bird.setAge(2);
        System.out.printf("Name: %s, age: %d, method: %s, isFly: %b \n\n", bird.getName(), bird.getAge(), bird.getSoundMethod(), bird.getIsFly());


        Square square = new Square(10);
        square.setSide(5);
        System.out.printf("Площадь квадрата со стороной %.2f равна %.2f, периметр равен %.2f \n\n", square.getSide(), square.calculateArea(), square.calculatePerimeter());

        Circle circle = new Circle(10);
        circle.setRadius(5);
        System.out.printf("Площадь круга с радиусом %.2f равна %.2f, периметр равен %.2f \n\n", circle.getRadius(), circle.calculateArea(), circle.calculatePerimeter());

        Triangle triangle = new Triangle(10, 10, 10);
        triangle.setSide1(6);
        triangle.setSide2(8);
        System.out.printf("Площадь треугольника со сторонами %.2f, %.2f и %.2f равна %.2f, периметр равен %.2f \n\n", triangle.getSide1(), triangle.getSide2(), triangle.getSide3(), triangle.calculateArea(), triangle.calculatePerimeter());
    }
}
