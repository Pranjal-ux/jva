import java.util.Scanner;

class Adder {
    int a;
    int b;

    Adder(int x, int y) {
        a = x;
        b = y;
    }

    int sum() {
        return a + b;
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scn.nextInt();

        Adder obj = new Adder(num1, num2);
        System.out.println("Result: " + obj.sum());

        scn.close();
    }
}
