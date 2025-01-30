import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Demonstrating Arithmetic Operators
        System.out.println("\nArithmetic Operators:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // Addition
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // Subtraction
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // Multiplication
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // Division
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // Modulus

        // Demonstrating Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2)); // Equal to
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2)); // Not equal to
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));   // Greater than
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));   // Less than
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2)); // Greater than or equal to
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2)); // Less than or equal to

        // Demonstrating Logical Operators
        System.out.println("\nLogical Operators:");
        boolean condition1 = num1 < 0 && num2 > 0; // Both numbers positive
        boolean condition2 = num1 < 0 || num2 < 0; // At least one number negative
        boolean condition3 = !(num1 > 0);          // num1 is not positive

        System.out.println("Both numbers are positive: " + condition1);
        System.out.println("At least one number is negative: " + condition2);
        System.out.println("num1 is not positive: " + condition3);

        // Close the scanner
        scanner.close();
    }
}
