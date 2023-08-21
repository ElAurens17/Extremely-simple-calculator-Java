import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Display menu
    System.out.println("Select an operation:");
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Multiply");
    System.out.println("4. Divide");
    int choice = scanner.nextInt();

    int num1, num2;

    // Get input numbers
    System.out.print("Enter first number: ");
    num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    num2 = scanner.nextInt();

    scanner.close();

    int result = 0;

    // Perform the selected operation
    switch (choice) {
      case 1:
        result = Add(num1, num2);
        break;
      case 2:
        result = Subtract(num1, num2);
        break;
      case 3:
        result = Multiply(num1, num2);
        break;
      case 4:
        if (num2 != 0) {
          result = Divide(num1, num2);
        } else {
          System.out.println("Cannot divide by zero.");
          System.exit(1);
        }
        break;
      default:
        System.out.println("Invalid choice.");
        System.exit(1);
    }

    System.out.println("Result: " + result);
  }

  static int Add(int q, int y) {
    return q + y;
  }

  static int Subtract(int q, int y) {
    return q - y;
  }

  static int Multiply(int q, int y) {
    return q * y;
  }

  static int Divide(int q, int y) {
    return q / y;
  }
}
