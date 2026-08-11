package WEEK2;

public class REVERSINGTWICE {

	public static void reverse(int []ar , int start, int end) {
		while(start <end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end]= temp;
			start++;
			end --;
		}
	
	}
 public static void main(String[]args) {
     int [] ar = { 1,2,3,4,5,6};
     int k =3;
     k =k % ar.length;
     reverse(ar, 0 , ar.length-1);
     reverse(ar, 0 , k-1);
     reverse(ar, k, ar.length-1);
     for (int n : ar) {
    	 System.out.println(n);
     }
 }
}
