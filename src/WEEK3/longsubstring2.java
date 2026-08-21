package WEEK3;

public class longsubstring2 {
     public static boolean allUnique(String str) {
    	 String result = "";
    	 for ( char ch : str.toCharArray()){
    		 if(result.indexOf(ch) >= 0 ) {
    			  return false;
    		 }
    		 result += ch;
    	 }
    	 return true;
     }
	
	public static void main(String[] args) {
		String s ="abcde";
		System.out.println(allUnique(s));

	}

}
