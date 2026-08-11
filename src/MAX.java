package WEEK2;

public class MAX {

	public static void main(String[] args) {
		 int[]ar = {12,13,24,35,56};
		int max = ar[0];
		for (int n :ar) {
			if ( n >max)
				max = n;
		}
		System.out.println (max);
	}

}
