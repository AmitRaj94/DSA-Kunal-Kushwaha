import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char op;

        do {
            System.out.print("Enter the operation (+, -, *, /, %, or x to exit): ");
            op = input.next().trim().charAt(0);
            int result = 0;

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                switch (op) {
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
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                }

                System.out.println("Result: " + result);
            } else if (op == 'X' || op == 'x') {
                System.out.println("Exiting from calculator...");
                break;
            } else {
                System.out.println("Invalid input. Please try again!");
            }

        } while (true);

        input.close();
    }
}
