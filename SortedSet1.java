package das;

import java.util.*;

public class SortedSet1 {

    static final Comparator<String> IGNORE_CASE_ORDER
            = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> s = new TreeSet<String>(IGNORE_CASE_ORDER);
        s.add("Saurabh");
        s.add("Mayur");
        s.add("Niraj");
        s.add("Harsh");


        
//        for (String a : args) {
//            s.add(a);
//        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}