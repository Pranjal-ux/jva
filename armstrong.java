import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {
System.out.println("Enter the number");
try (Scanner scn = new Scanner(System.in)) {
    int n= scn.nextInt();
    Calarm(n);
}
    }
    public static void Calarm(int n){
       int check = n;
        int rem = 0;
        int sum = 0;
        while(n>0){
         rem = n%10;
            sum = (rem*rem*rem) + sum;
             n = n/10;
        }
         if(check == sum){
            System.out.println("The number is armstrong");
         }  
         else{
            System.out.println("The number is not armstrong");
         }  
        
    }
}