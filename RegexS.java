import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Pattern n = Pattern.compile("Saurabh",Pattern.CASE_INSENSITIVE);
	        Matcher t = n.matcher("SAUrabh");
	         if (t.find( )) {
	           System.out.println("First Name Matched!");   
	        }else{
	           System.out.println("First Name not matched :-(");    
	        }
	         
	      Pattern p = Pattern.compile("Chandavale",Pattern.CASE_INSENSITIVE);
		     Matcher m = p.matcher("Chandava");
		      if (m.find( )) {
		         System.out.println("Last Name Matched!");   
		       }else{
		         System.out.println("Last Name not matched :-(");    
		       }
	}

}