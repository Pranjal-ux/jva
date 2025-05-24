import java.util.Scanner;

public class progo3 {
    public static void main(String[] args) {
        System.out.println("Enter the NUMBER");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println("GradeA");
        } else if (a >= 80 && a <= 89) {
            System.out.println("GradeB");
        } else if (a >= 70 && a <= 79) {
            System.out.println("GradeC");
        } else if (a >= 60 && a <= 69) {
            System.out.println("GradeD");
        } else {
            System.out.println("GradeF");
        }
    }
}
