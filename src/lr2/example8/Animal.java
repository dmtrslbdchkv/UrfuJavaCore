package lr2.example8;

public class Animal {
    private String name;
    private int age;
    private String soundMakingMethod;

    public Animal(String name, int age, String soundMakingMethod) {
        this.name = name;
        this.age = age;
        this.soundMakingMethod = soundMakingMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSoundMethod() {
        return soundMakingMethod;
    }

    public void getSoundMethod(String soundMakingMethod) {
        this.soundMakingMethod = soundMakingMethod;
    }
}
