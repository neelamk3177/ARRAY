package WEEK2;

public class LEFTROTATION {

	public static void main(String[] args) {
	  int [] ar = {1,3,5,6,8};
	  int [] dummy = new int [ar.length];
	   for ( int i = 0; i< ar.length-1; i ++) {
		   dummy[i] = ar [i+1];
	   }
	   dummy[ar.length-1] = ar [0];
    for ( int n : dummy ) {
	System.out.println(n);
}
	}

}
