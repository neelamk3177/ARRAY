package WEEK3;

public class longestsubstring {
  public  static boolean  allUnique(String str) {
	  int [] ar = new int [128];
	  for( char ch : str.toCharArray()) {
		  ar[ch]++;
		  if (ar[ch]==2) {
			  return  false;
		  }
		  }
	  return true;
  }
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(allUnique(s));
	}

}
