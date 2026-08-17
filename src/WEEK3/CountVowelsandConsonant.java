package WEEK3;

public class CountVowelsandConsonant {

	public static void main(String[] args) {
		String str= "Programming";
		int vowels=0; 
		int consonant = 0;
		for(int i =0 ; i <str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
		
   if (ch >='a' && ch<='z') {
	   if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
	            vowels  ++;
	        } 
	        else if (Character.isLetter(ch)) {
	            consonant++;
	        }
   }
	    }
		System.out.println("vowel: "+vowels);
		System.out.println("consonant: "+consonant);
		
   }
}        
