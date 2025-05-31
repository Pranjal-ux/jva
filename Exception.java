import java.util.*;

public class Exception {
    public static void main(String[] args) throws Hayato {
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        if (a > 100) {

            throw new Hayato();
        }

        int a[] = new int[5];
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Try to acess the out of bound element ");
        } finally {
            System.out.println("chalia shuru karte hai ");
        }

    }
}

class Hayato extends RuntimeException {

}
