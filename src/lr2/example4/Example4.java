package lr2.example4;

public class Example4 {
    public static void main(String[] args) {
        Person person1 = new Person("Dima", 22, "male");
        person1.setName("Ekaterina");
        person1.setAge(24);
        person1.setGender("Female");
        System.out.println("Name = " + person1.getName() + " age = " + person1.getAge() + " gender = " + person1.getGender());
    }
}
