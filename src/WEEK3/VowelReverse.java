package WEEK3;
import java.util.Scanner;

public class VowelReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		char[]ar = str.toCharArray();
		int l =0;
		int r=str.length()-1;
		while(l<r) {
			while(l<r && "aeiouAEIOU".indexOf(ar[l])==-1)l++;
			while(l<r && "aeiouAEIOU".indexOf(ar[r])==-1)r--;
			 char temp = ar[l];
	            ar[l] = ar[r];
	            ar[r] = temp;
	            l++;
	            r--;
		}
		  System.out.println(new String(ar));
	}

}
