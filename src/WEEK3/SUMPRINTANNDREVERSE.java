package WEEK3;
import  java.util.Scanner;
public class SUMPRINTANNDREVERSE {
public static void main(String[]args) {
	Scanner sc = new  Scanner(System.in);
	int[] ar= {1,2,3,4,1,3,1,3,1,4,2};
	int k =3;
	int l =0;
	int r =0;
	int sum=0;
	for(; r<k ;r++){
		sum = sum+ ar[r];
	} 
	int maxSum=sum;
	System.out.println(sum);
	for (; r < ar.length; r++, l++) {
            sum = (sum - ar[l]) + ar[r];
            maxSum= Math.max(maxSum, sum);
	}
	System.out.println("Max:" + maxSum);
}
}
