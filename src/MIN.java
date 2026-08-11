package WEEK2;

public class MIN {

	public static void main(String[] args) {
	 int []ar = {12,13,34,45,56};
	 int min = ar[0];
	  for (int n : ar) {
		  if(n <min) {
			  min = n ;
		  }		  
		  System.out.println(min);
	  }

	}

}
