package p;

import p2.C;

class A{
    public void sayHello(){
        System.out.println("Hello from A");
    }
}
/* Public modifier can be accessed in any package
* default modifier is accessed only in that package
* Private modifier accessed only within that class
* Protected modifier accessed within package and also within subclass of other package */
public class B extends C{
    public static void main(String[] args) {
A a=new A();
a.sayHello();;

B b=new B();
b.sayHello();
    }
}
