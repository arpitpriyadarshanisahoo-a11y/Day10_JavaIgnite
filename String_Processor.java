import java.util.Scanner;
public class StringProcessor {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter a String: ");
	            String str = sc.nextLine();

	            System.out.print("Enter start index for substring: ");
	            int start = sc.nextInt();

	            System.out.print("Enter end index for substring: ");
	            int end = sc.nextInt();

	            System.out.print("Enter index for charAt: ");
	            int index = sc.nextInt();

	            String sub = str.substring(start, end);
	            char ch = str.charAt(index);

	            System.out.println("Substring: " + sub);
	            System.out.println("Character at index " + index + ": " + ch);
	        }
	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Invalid index handled safely");
	        }
	        finally {
	            sc.close();
	        }

	}

}
