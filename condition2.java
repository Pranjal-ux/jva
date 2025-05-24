import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int a = scn.nextInt();
        System.out.println("Enter the second value:");
        int b = scn.nextInt();
        System.out.println("Enter the third value:");
        int c = scn.nextInt();
        System.out.println("Comparison between three values:");
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }

        scn.close(); 
    }
}
