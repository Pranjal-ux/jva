import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("Check the year");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year%4==0 && year%100!=0 ||year%400==0){
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not leap year");
               }
    }
}
