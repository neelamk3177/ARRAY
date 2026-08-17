package WEEK3;

public class CharacterisLETTER {
public static void main (String []args) {
	String s = "88888 m ,,,,,,,  a a m  ";
	char[] a = s.toCharArray();
	int i = 0;
	int j = s.length() - 1;
	boolean f = true;
	while (i < j) {
	    while (i < s.length() && !Character.isLetter(a[i]))
	        i++;
	    while (j >= 0 && !Character.isLetter(a[j]))
	        j--;
	    if (i < j) {
	        if (Character.toLowerCase(a[i]) != Character.toLowerCase(a[j])) {
	            f = false;
	            break;
	        }
	        i++;
	        j--;
	    }
	}
	System.out.println(f);
	}
}

