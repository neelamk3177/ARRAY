package WEEK2;

import java.util.Arrays;

public class SECONDMAX {

	public static void main(String[] args) {
		int []ar = {12,23,45,56,67,78};
		Arrays.sort(ar);
		int max = ar[ar.length-1];
	int smax = - 1;
	
	for (int i = ar.length - 2 ; i >0 ; i --) {
			 if (max!= ar[i]) {
				 smax= ar[i];
;
				 break;
			 }
	}
		System.out.println(smax);

	}

	}
