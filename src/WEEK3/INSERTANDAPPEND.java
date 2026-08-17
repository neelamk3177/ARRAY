package WEEK3;

public class INSERTANDAPPEND {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(" hello ");
		sb.append(" false ");
		sb.append(" 12 ");
		 // for inserting the value at start
		sb.insert(0,  " java "); 
		//for deleting the character
        sb.delete(sb.length()-1 , sb.length());
	
   System.out.println(sb);
}
}