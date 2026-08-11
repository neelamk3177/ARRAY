package WEEK2;

public class SWAPFIRSTANDLAST {

	public static void main(String[] args) {
		        int[] ar = {12, 13, 34, 45, 56};
		        int temp = ar[0];
		        ar[0] = ar[ar.length - 1];
		        ar[ar.length - 1] = temp;
		         for (int n : ar) {
		            System.out.println(n);
		        }
		    }
}
	


