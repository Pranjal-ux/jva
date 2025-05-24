import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.println("enter the first value");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("enter the second value");
        Scanner dcn = new Scanner(System.in);
        int b = dcn.nextInt();
        int c = a + b;
        System.out.println("final result");
        System.out.println(c);

    }
}