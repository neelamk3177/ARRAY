package WEEK2;

import java.util.Arrays;

public class MOVEZEROS {

	public static void main(String[] args) {
		int [] ar  = {1,0,4,0,4,0,0,6};
		int [] dummy = new int [ar.length];
		int p =0;
		for(int i = 0; i <ar.length; i ++) {
			if(ar [i] != 0 ) {
				dummy [p] =ar[i];
				p++;
			}
		}
		ar = dummy;
		System.arraycopy ( dummy , 0 , ar,0,ar.length);
		System.out.println(Arrays.toString(ar));
	}

}
