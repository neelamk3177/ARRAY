package WEEK3; 
import java.util.Arrays;

public class Slit {

	public static void main(String[] args) {
		String str = "hello  java   programming ";
		String[] ar = str.split("\\s+");
		System.out.println(Arrays.toString(ar));
		

	}

}
