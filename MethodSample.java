package p;
public class MethodSample {
    public static void main(String[] args) {
        MethodSample obj =new MethodSample();
        obj.sayHello("male");
        System.out.println(calAvg(7,9,11));
    }
    public  void sayHello(String gender){
        String newText = gender.equalsIgnoreCase("Male") ?"Hello, sir" : "Hello, Madam";
        System.out.println(newText);
    }
    public static double calAvg(int a, int b, int c){
        return (a+b+c)/3;
    }
}


