 package WEEK2;
import java.util.Arrays;
public class ARRAYROTATE {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int first=arr[0];
		System.arraycopy(arr,1,arr,0,arr.length-1);
		arr[arr.length-1]=first;
		System.out.println(Arrays.toString(arr));

	}

}
