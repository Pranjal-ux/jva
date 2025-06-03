import java.util.Scanner;

class Addition {
    int a, b;

    // Parameterized constructor to initialize a and b
    Addition(int x, int y) {
        a = x;
        b = y;
    }

    // Method to calculate and return the sum
    int calculateSum() {
        return a + b;
    }
}

public class ConstructorAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();

        // Create an object of Addition using the parameterized constructor
        Addition obj = new Addition(num1, num2);

        // Calculate and display the sum
        int sum = obj.calculateSum();
        System.out.println("Sum: " + sum);
    }
}
