package WEEK2;
import java.util.Arrays;
public class ZERO2 {

	public static void main(String[] args) {
		int [] ar = {1,0,0,4,0,4,0,6};
		int i =-1;
		int j= 0;
		while (j<ar.length) {
			if(ar[j] != 0) {
				i++;
				int temp = ar [i];
				ar[i]= ar[j];
				ar[j] = temp;
			}
			j++;
		}
		System.out.println(Arrays.toString(ar));
	}

}
