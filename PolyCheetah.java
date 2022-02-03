package polymorphism;

public class PolyCheetah extends PolyWildAnimal {
    public static void main(String[] args) {
        PolyCheetah c = new PolyCheetah();
        c.setMinSpeed("130 km/hr");
        c.eat();
        c.run();
    }
}
