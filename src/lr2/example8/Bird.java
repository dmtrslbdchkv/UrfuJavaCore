package lr2.example8;

public class Bird extends Animal {
    private boolean isFly;

    public Bird(String name, int age, String soundMakingMethod, boolean isFly) {
        super(name, age, soundMakingMethod);
        this.isFly = isFly;
    }

    public boolean getIsFly() {
        return isFly;
    }


    public void setIsFly(boolean isFly) {
        this.isFly = isFly;
    }
}
