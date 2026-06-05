import java.util.Scanner;
import java.util.InputMismatchException;


public class StudentMarksSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = {85, 90, 78, 88, 95};

        try {
            System.out.print("Enter index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Mark = " + marks[index]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }

        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        finally {
            sc.close();
        }
    }

}
