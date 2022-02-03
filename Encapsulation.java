package p2;

public class Encapsulation {
    public static void main(String[] args) {

        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(22);
        alex.setGender("Male");
        System.out.println(alex.getName());
        alex.sleep();

        Person mia = new Person();
        mia.setName("Mia");
        mia.setAge(44);
        mia.setGender("Female");
        System.out.println(mia.getName());
        mia.sleep();

    }
}

class Person{

    private String  name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
