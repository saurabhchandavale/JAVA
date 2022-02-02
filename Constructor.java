package p;
public class Constructor {
    public static void main(String[] args) {

        Per alex = new Per("Alex", 55, "Male");
        alex.sleep();
        Per mia = new Per("Mia", 15, "Female");
        mia.sleep();
    }
}
class Per{
    String  name;
    int age;
    String gender;
public Per(){
    System.out.println("This is default constructor");
}
//Constructors don't have return type, Name of constructor same as class,
//If you not create any constructor system automatically create a default constructor
//You can call one constructor from another by using this() or super().
    public Per(String name, int age, String gender){
        this();
        System.out.println("This is constructor with arguments");
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    void sleep(){
        if(age<10){
            System.out.println(name + " Will sleep more than 12 hours a day.");
        }else if(age>=10&&age<=50){
            System.out.println(name + " Will sleep less than 10 hours a day.");
        }else{
            System.out.println(name + " Will sleep avg 10 hours a day.");
        }
    }
}
