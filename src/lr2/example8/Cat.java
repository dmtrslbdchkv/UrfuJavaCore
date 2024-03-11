package lr2.example8;

public class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String soundMakingMethod, String foodType) {
        super(name, age, soundMakingMethod);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
