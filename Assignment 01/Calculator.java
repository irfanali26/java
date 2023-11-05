import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to the Calculator Program!");
        
        while (true) {
            System.out.println("Please enter an expression (e.g., 5 + 10) or 'exit' to quit:");

            // Input: Read the expression as a string
            String expression = input.nextLine();

            if (expression.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the Calculator Program. Goodbye!");
                break;
                   }

            // Parse the expression
            String[] tokens = expression.split(" ");
            if (tokens.length != 3) {
                System.out.println("Invalid input. Please provide an expression in the format            'number operator number'.");
                continue; // Continue to the next iteration
            }

            // Parse the numbers and operator
            try {
                num1 = Double.parseDouble(tokens[0]);
                operator = tokens[1].charAt(0);
                num2 = Double.parseDouble(tokens[2]);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Invalid input. Please provide valid numbers and operator.");
                continue; // Continue to the next iteration
            }

            // Perform the calculation based on the operator
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
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        continue; 
// Continue to the next iteration
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    continue;
 // Continue to the next iteration
            }

            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
