package polymorphism;

public class PolyElephant extends PolyWildAnimal {
    @Override
    public void eat() {
        System.out.println("I will eat fruits");
    }

    public static void main(String[] args) {
        PolyElephant e = new PolyElephant();
        e.setMinSpeed("20 km/hr");
        e.eat();
        e.run();
    }
}
