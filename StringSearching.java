public class StringSearching{
    public static void main(String[] args){
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
        sentence[12] = "We live in an age of science and feel";
        sentence[13] = "The computer, the greatest gift of the 20th century";
        sentence[14] = "Early men did not know how to grow food and use fire.";
        
        String[] words = new String[5];
        words[0] =  "by";
        words[1] =  "are";
        words[2] =  "fire";
        words[3] =  "Forum";
        words[4] =  "swear";
        

        int count = 0;
        for(int i = 0; i < sentence.length; i++){
        	for(int j = 0; j < words.length; j++) {
        		if(sentence[i].contains(words[j])) {
        			count++;

        		}
        	}
        }
        System.out.println("Words you looking for contains " + count + " times.");


    }
}