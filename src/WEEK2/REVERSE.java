package WEEK2;

public class REVERSE {

	public static void main(String[] args) {
		int [] ar = {12,13,14,15,36};
		int start = 0;
		int last = ar.length-1;
		  while(start< last) {
			  int temp = ar[start];
			  ar [start] = ar[last];
			  ar[last] = temp;
			  start ++;
			  last--;
			  
		  }
     for (int n: ar) {
    	 System.out.println(n);
     }
	}

}
