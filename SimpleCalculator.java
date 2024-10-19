import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            try {
                // User inputs
                System.out.print("Enter the first number: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double secondNumber = scanner.nextDouble();

                // Operation selection
                System.out.println("Select an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");

                int operation = scanner.nextInt();
                double result = 0;

                switch (operation) {
                    case 1:
                        result = firstNumber + secondNumber;
                        System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + result);
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + result);
                        break;
                    case 3:
                        result = firstNumber * secondNumber;
                        System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + result);
                        break;
                    case 4:
                        if (secondNumber == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = firstNumber / secondNumber;
                            System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + result);
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operation selected.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
                scanner.next(); // Clear the invalid input
            }

            // Check if user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            continueCalculating = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}
