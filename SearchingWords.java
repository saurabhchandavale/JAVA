public class SearchingWords{
	
	public static int CountWordsStartWithA(String[] sentence, String[] awords, int count) {
		   for(int i = 0; i < sentence.length; i++){
	        	for(int j = 0; j < awords.length; j++) {
	        		if(sentence[i].contains(awords[j])) {
	        			count++;

	        		}
	        	}
	        }
		   return count;
	}
	
	
	public static int ModerateWords(String[] sentence, String[] cwords, int count) {
		   for(int i = 0; i < sentence.length; i++){
	        	for(int j = 0; j < cwords.length; j++) {
	        		if(sentence[i].contains(cwords[j])) {
	        			count++;

	        		}
	        	}
	        }
		   return count;
	}
	
	public static int BadWords(String[] sentence, String[] bad, int count) {
		   for(int i = 0; i < sentence.length; i++){
	        	for(int j = 0; j < bad.length; j++) {
	        		if(sentence[i].contains(bad[j])) {
	        			count++;

	        		}
	        	}
	        }
		   return count;
	}
	
	
    public static void main(String[] args){
    	int count = 0;
        String[] sentence = new String[15];
        sentence[0] = "Many people get offended by swear words";
        sentence[1] = "Sometimes we come across some forgetful persons in our surroundings.";
        sentence[2] = "When the checker demanded the ticket";
        sentence[3] = "Einstein still went on searching and remarked that he was searching";
        sentence[4] = "to find out where he was going";
        sentence[5] = "Most of the people of our country are farmers";
        sentence[6] = "The prices of rice";
        sentence[7] = "black marketing are responsible";
        sentence[8] = "The government should set up more";
        sentence[9] = "The Consumer Forum should also be more active";
        sentence[10] = "We all know that health is wealth.";
        sentence[11] = "To compensate for this change in lifestyle we need";
        sentence[12] = "The domestic donkey is a hoofed mammal in the family Equidae, the same family as the horse.";
        sentence[13] = "The computer, the greatest gift of the 20th century";
        sentence[14] = "Monkey is a common name that may refer to most mammals";
        
        String[] awords = new String[5];
        awords[0] =  "am";
        awords[1] =  "are";
        awords[2] =  "amount";
        awords[3] =  "amazing";
        awords[4] =  "also";
        
        String[] cwords = new String[5];
        cwords[0] =  "cat";
        cwords[1] =  "cam";
        cwords[2] =  "camera";
        cwords[3] =  "century";
        cwords[4] =  "change";
        
        String[] bad = new String[5];
        bad[0] = "fool";
        bad[1] = "mad";
        bad[2] = "swear";
        bad[3] = "donkey";
        bad[4] = "monkey";

               
		System.out.println("Words starting with a contains " + CountWordsStartWithA(sentence, awords, count) + " times.");
		System.out.println("Moderate words contains " + ModerateWords(sentence, cwords, count) + " times.");
		System.out.println("Bad words contains " + BadWords(sentence, bad, count) + " times.");


    }
}
