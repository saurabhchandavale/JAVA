public class ClassObjExample {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name="Alex";
        alex.age= 55;
        alex.gender="Male";
        alex.sleep();

        Person mia = new Person();
        mia.name="Mia";
        mia.age=40;
        mia.gender="Female";
        mia.sleep();

        Person james= new Person();
        james.name="James";
        james.age=8;
        james.gender="Male";
        james.sleep();
    }
}

class Person{
String  name;
int age;
String gender;
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
