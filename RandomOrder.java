import java.util.ArrayList;
import java.util.Collections;

public class RandomOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Saurabh");
		a.add("Mayur");
		a.add("Niraj");
		a.add("Pream");
		
		//shuffle the list
		System.out.println("Use of Shuffle Method");
		Collections.shuffle(a);
		System.out.println(a);
		
		//Use of for-each loop
		System.out.println("Use of For-each ");

		for(String arr : a) {
			System.out.println(arr);
		}
		
		System.out.println("Use of Stream ");

		 a.forEach(s -> System.out.println(s));


	}

}
