package p;

public class TypeCasting {
    float f = 50.21f;
    int x =(int)f; //Explict casting
    double y = f;  //Implict casting
    byte a = 50;
    byte b = 60;
    byte c = (byte)(a+b);
    byte d = 50;
    byte e = 100;
    int g = d+e;
    public static void main(String[] args) {
        TypeCasting obj= new TypeCasting();
        System.out.println(obj.f);
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.c);
        System.out.println(obj.g);
    }
}