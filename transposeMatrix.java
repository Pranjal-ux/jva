import java.util.*;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int[][] a = new int[2][2];
        System.out.println("Input the elements of a 2x2 matrix:");

    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                a[i][j] = scn.nextInt();
            }
        }

    
        System.out.println("\nOriginal matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    
        System.out.println("\nTranspose of the matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
