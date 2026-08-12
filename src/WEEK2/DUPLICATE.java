package WEEK2;

public class DUPLICATE {

	public static void main(String[] args) {
	int [] ar = {1,2,3,4,4,4,5,5,6,6,6,6};
	int i =0;
	for (int j =1 ; j < ar.length; j ++) {
		if (ar[i] != ar [j]) {
			i ++;
			ar[i] = ar [j];
		}
	}
 for (int k = 0 ; k <= i; k ++) {
	 System.out.println(ar[k]+ " ");
 }
	}

}
