import java.io.File;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		try {
			File obj = new File("C:\\Users\\Saurabh\\OneDrive\\Desktop\\Java\\Java.txt");
			Scanner scn = new Scanner(obj);

	          while ( scn.hasNextLine() ){
	            s = scn.nextLine();
	            int counter = 0;

	            for( int i=0; i<s.length(); i++ ) {
	                if( s.charAt(i) == 'a' ) {
	                    counter++; 

	                } 

	            }
	            System.out.println(counter);
			
			
		}

	}catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}