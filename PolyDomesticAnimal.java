package polymorphism;

public class PolyDomesticAnimal extends PolyAnimal {
    @Override
    public void eat() {
        System.out.println("I will eat apple.");
    }

    @Override
    public void run() {
        System.out.println("I am running at " + getMinSpeed());
    }
}
