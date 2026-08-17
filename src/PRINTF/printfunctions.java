package PRINTF;

public class printfunctions {

	public static void main(String[] args) {
		   int num = 25;
		        double decimal = 12.34567;
		        char grade = 'A';
		        String name = "Neelam";
		        boolean result = true;

		        // Integer
		        System.out.printf("%d%n", num);

		        // Floating point
		        System.out.printf("%f%n", decimal);

		        // Decimal places
		        System.out.printf("%.2f%n", decimal);

		        // Character
		        System.out.printf("%c%n", grade);

		        // String
		        System.out.printf("%s%n", name);

		        // Boolean
		        System.out.printf("%b%n", result);

		        // Hexadecimal
		        System.out.printf("%x%n", num);

		        // Octal
		        System.out.printf("%o%n", num);

		        // Width
		        System.out.printf("%10d%n", num);

		        // Zero padding
		        System.out.printf("%05d%n", num);

		        // Left alignment
		        System.out.printf("%-10s%n", name);

		        // Positive sign
		        System.out.printf("%+d%n", num);

		        // Comma separator
		        System.out.printf("%,d%n", 1000000);

		        // New line
		        System.out.printf("Hello%nWorld");
		    }
		}

	
