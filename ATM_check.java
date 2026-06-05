import java.util.Scanner;
import java.util.InputMismatchException;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class NegativeAmountException extends Exception {
    NegativeAmountException(String msg) {
        super(msg);
    }
}
public class ATMExceptionDemo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter Account Balance: ");
	            double balance = sc.nextDouble();

	            System.out.print("Enter Withdrawal Amount: ");
	            double withdraw = sc.nextDouble();

	            if (withdraw < 0) {
	                throw new NegativeAmountException("Withdrawal amount cannot be negative.");
	            }

	            if (withdraw > balance) {
	                throw new InsufficientBalanceException("Insufficient Balance.");
	            }

	            balance = balance - withdraw;

	            System.out.println("Transaction Successful");
	            System.out.println("Remaining Balance: " + balance);
	        }

	        catch (InputMismatchException e) {
	            System.out.println("Invalid Input");
	        }

	        catch (NegativeAmountException e) {
	            System.out.println(e.getMessage());
	        }

	        catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }

	        finally {
	            sc.close();
	        }
	    }

}
