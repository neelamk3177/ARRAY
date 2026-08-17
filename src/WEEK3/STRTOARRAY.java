package WEEK3;

public class STRTOARRAY {

	public static void main(String[] args) {
		String str = "abcdefgh";
		char[] ar = str.toCharArray();
		int i =0;
		int j =ar.length-1;
		while(i<j) {
		 char temp =ar[i];
		 ar[i] = ar[j];
	    ar[j]= temp;
		 i ++;
		 j--;
	}
   System.out.println(ar);
}
}