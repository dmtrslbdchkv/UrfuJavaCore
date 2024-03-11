package lr2.example8;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String soundMakingMethod, String breed) {
        super(name, age, soundMakingMethod);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
