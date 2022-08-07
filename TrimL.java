import java.util.*;

public class TrimL {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }
    		//For Statement does not allow to modify 
    		//but by using Iterator we can modify
    public static void main(String[] args) {
        List<String> l = Arrays.asList(" Saurabh ", " Amit ", " Vish ", "   Niraj   ");
        listTrim(l);
        for (String s : l) {
            System.out.println(s);
        }
    }
}