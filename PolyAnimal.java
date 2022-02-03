package polymorphism;

public abstract class PolyAnimal {
    private String minSpeed;

    public String getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(String minSpeed) {
        this.minSpeed = minSpeed;
    }

    public abstract void eat();
    public abstract void run();


}

