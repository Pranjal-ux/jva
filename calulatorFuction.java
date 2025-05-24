import java.util.*;
public class calulatorFuction {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the  first integer number");
        int a = scn.nextInt();
        System.out.println("Enter the second float number ");
        int b =scn.nextInt();
        System.out.println("Enter the operator who would you like to perfom");
        char operator = scn.next().charAt(0);
        calculator(a,b,operator);
    }
    public static void calculator (int a ,int b,char operator){
switch (operator) {
    case '+':
    System.out.println(a+b);
        
        break;
        case '-':
        System.out.println(a-b);
        break;
        case '*':
        System.out.println(a*b);
        break;
        case '/':
        System.out.println("a/b");


    default:
    System.out.println("empty");
        break;
}
    }
}
