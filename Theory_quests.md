1)Explain Java Exception hierarchy:
Throwable
Exception
Error
Give one example for each.
ANS:

Throwable → Parent class of all errors and exceptions.
Example: Throwable t = new Exception();
Exception → Problems that can be handled by the programmer.
Example: ArithmeticException, NullPointerException, InputMismatchException
Error → Serious problems that usually cannot be handled by the program.
Example: OutOfMemoryError, StackOverflowError
Hierarchy:
Plain text
Throwable
   |
   |-- Exception
   |
   |-- Error


2)Can we have multiple catch blocks?
Explain with example when it is useful.
ANS:

Yes, we can use multiple catch blocks in one try block. It is useful when different exceptions need different handling.
Example:
Java
try {
    int a = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
catch (Exception e) {
    System.out.println("Some other error");
}
Use: It helps us give different messages for different errors.


3)A program crashes when user enters text instead of number.
What exception occurs?
How will you handle it?
Where should try-catch be placed?
ANS:

Around the code that takes input from the user.
Example:
Java
try {
    int num = sc.nextInt();
}
catch (InputMismatchException e) {
    System.out.println("Invalid Input");
}
This prevents the program from crashing and shows a proper message.



4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 

What prints first?

Does program stop?

ANS:

try {
    int a = 10 / 0;
    System.out.println("Hello");
}
catch(Exception e) {
    System.out.println("Error handled");
}

System.out.println("End");
Output:
Plain text
Error handled
End

Error handled prints first because division by zero causes an exception.

No. The exception is caught by the catch block, so the program continues and prints End.




