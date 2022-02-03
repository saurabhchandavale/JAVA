package p2;

import java.util.Locale;

public class StringSample {
    public static void main(String[] args) {
//        String s1 = new String("Welcome"); // Here ref stored in heap
//        String s2 = new String("Welcome");
        String s1 = "welcome to";
        String s2 = s1;
        String s3 = "Welcome to";
        s2.concat("Java");

//StringBuffer
        StringBuffer s9 = new StringBuffer("Welcome");
        s9.append("....!!");

        if(s1.equalsIgnoreCase(s3)){  // it will check the content and return true or false
            System.out.println("Both are pointing same object.");
        }else{
           System.out.println("Both are pointing different object.");
        }

//        String s2 = "Welcome";  // Here string in string pool. //
//        First obj stores welcome value and then refers to s1 and when s2 runs welcome is already stored

        String s4 = new String("Welcome");
        String s5 = new String("Welcome");

        if(s4 == s5){   // It checks references and then return
           System.out.println("Both are pointing same object.");
       }else{
           System.out.println("Both are pointing different object.");
        }
        
        System.out.println(s1);
        System.out.println(s1.charAt(2));
        System.out.println( s2.concat("Java"));
        System.out.println(s1.replace(" ", "_"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1,5));
        System.out.println(s1.toUpperCase(Locale.ROOT));
        System.out.println(s9);
    }
}
