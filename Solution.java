
// Create the classes here

class Solution {

    public static void main(String args[]) {

        // Write your code here
        Son s = new Son("Shamsundar","Jalindar", "Saurabh");
        s.printName();

    }
}

class GrandFather {
    private String grandFatherName ;
    public GrandFather(String grandFatherName ) {
        this.grandFatherName  = grandFatherName ;
    }

    public void printName(){
        System.out.println("grandfathername:  " + grandFatherName);

    }

}

class Father extends GrandFather{
    private String fatherName ;

    public Father(String grandFatherName, String fatherName) {
        super(grandFatherName);
        this.fatherName = fatherName;

    }
    public void printName(){
        System.out.println("fathernam:  " + fatherName);
        super.printName();


    }

}

class Son extends Father{
    private String sonName ;

    public Son(String grandFatherName, String fatherName, String sonName) {
        super(grandFatherName, fatherName);
        this.sonName = sonName;
    }
    public void printName(){
        System.out.println("sonname:  " + sonName);
        super.printName();


    }
}
