package WEEK2;

public class DUMMYREVERSE {

	public static void main(String[] args) {
	    int []ar = {23,64,42,52,64};
	    int [] dummy =  new int [ar.length];
	    int j = 0;
	     for (int i = ar.length-1  ; i >=0; i-- ) {
	    	 dummy[j] = ar[i];
	    	 j++;
	     }
	    for (int n : dummy) {
	    	System.out.println(n);
	    }

	}

}
