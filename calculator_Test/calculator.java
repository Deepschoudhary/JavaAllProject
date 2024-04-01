package calculator_Test;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("+. Addition");
        System.out.println("-. Subtraction");
        System.out.println("*. Multiplication");
        System.out.println("/. Division");

        System.out.print("Enter choice (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:

                System.out.println("Invalid choice. Please enter a valid operator (+, -, *, /).");
                return;
        }

        System.out.println("Result: " + result);
    }
}


