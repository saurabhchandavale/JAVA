package polymorphism;

public class PolyCat extends PolyDomesticAnimal{

    //Method-Overriding
    @Override
    public void eat() {
        super.eat();
        System.out.println("I will eat meat as well");
    }
    //compile time polymorphism or method overloading
public void run(boolean hasDanger){
        if(hasDanger){
            System.out.println("I am running at 48 km/hr");
        }else{
            super.run();
        }
}
    public static void main(String[] args) {
        PolyCat c = new PolyCat();
        c.setMinSpeed("24 km/hr");
        c.eat();
        c.run(true);
    }
}
