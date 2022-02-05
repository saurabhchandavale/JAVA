package p;

import java.util.HashMap;
import java.util.Map;
/*HashMap works on hashing principle
* Is stores data in buckets
* It allow one key value as null*/
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> myHash = new HashMap<>();
        myHash.put("IND","INDIA");
        myHash.put("US","UNITED STATES");
        myHash.put("UK","UNITED KINGDOM");
        myHash.put("WI","Indies");
        System.out.println(myHash.size());
        System.out.println(myHash.get("IND"));
        myHash.remove("WI");
for(Map.Entry<String,String> map: myHash.entrySet()){
    System.out.println(map.getKey()+ " : " + map.getValue() );
        }
    }
}
