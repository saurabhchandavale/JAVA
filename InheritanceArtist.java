package p;

public class InheritanceArtist extends InheritanceHuman {
    public void preparePainting() {
        System.out.println(name + " is preparing for painting");
    }

    public static void main(String[] args) {
        InheritanceArtist a =new InheritanceArtist();
        a.name =" Saurabh";
        a.age  = 22;
        a.gender = "Male";

        a.preparePainting();;
        a.walk();
        a.speak();
    }
}