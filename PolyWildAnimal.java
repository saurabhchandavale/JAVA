package polymorphism;

public class PolyWildAnimal extends PolyAnimal{
    @Override
    public void eat() {
        System.out.println("I will eat meat.");
    }

    @Override
    public void run() {
        System.out.println("I am running at " + getMinSpeed());
    }
}
