package p;
import javax.management.AttributeList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/*ArrayList is similar to Array
* difference in ArrayList is that It stores different types of data and size of ArrayList
* not fixed we can change is dynamically*/

public class ArrayListE {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Grape");
        Collections.sort(myList);

        for(String element:myList);
      //  myList.remove("Orange");
        System.out.println(myList);
    }
}
