// public class function {
//     public static void main(String[] args) {
//         System.out.println("shit about the thing");
//         getage();
//     }
//     static void getage(){
//         System.out.println("function is called");
//     }
// } 

//Finding even number in java//

// public class function {
// public static void main(String[] args) {
//     System.out.println("calculate the even number");
//     int a = 6;
//     caleven(a);
// }
//     public static void caleven(int a){
// if(a%2==0){
//     System.out.println("the given number is even");
// }
// else{
//     System.out.println("the given number is not even");
// }
//     }
// }

// Finding prime number in java using function//

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        System.out.println("Input the prime number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = scn.nextInt();
        calprime(n, count);
    }

    public static void calprime(int n, int count) {
        for (int i = 1; i <= n; i++) {
            if (i % n == 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("The number is prime");
            } else {
                System.out.println("the number is not prime");
            }
        }
    }

}
