package p;

public class InheritanceMusician extends InheritanceHuman {

    keyboard myKeyboard = new keyboard();  // Has-A relationship

    public void playKeyboard(){
    System.out.println(name + " is playing keyboard now");
}
public void speak(){
    System.out.println(name + " will speak loud.");
}

    public static void main(String[] args) {

    InheritanceMusician a = new InheritanceMusician();

        a.name = "Ram";
        a.age = 43;
        a.gender = "Male";

        a.playKeyboard();;
        a.walk();
        a.speak();
        a.myKeyboard.playSound();
    }
}
