package p;
public class VariableSample {
    int x;
    boolean y; //Instance Variable
    public static void main(String[] args) {
        int local=5;  //local Variable
     VariableSample obj= new VariableSample();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(local);
        /*You can make instance variable default
        * but you van not make local variable as default
        * you have to declare value to locale variable before
        * it executed*/
    }
}
