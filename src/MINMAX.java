package WEEK2;

public class MINMAX {

	public static void main(String[] args) {
 int  [] ar = {1,2,3,4,5,6,6,6,6,6,6};
 int fmax = ar[0];
 int smax = Integer.MIN_VALUE;
  for  ( int n : ar ){
	   if (fmax <n ) {
		   smax = fmax;
		   fmax= n;
	   }
	   else if(fmax>n && smax<n ){
		   smax = n;
	   }
  }
System.out.println("fmax:" + fmax);
System.out.println("smax:" +smax);
}
}