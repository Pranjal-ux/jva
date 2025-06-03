import java.util.Scanner;

class Addition {
    int a, b;

    // Method to perform addition
    int add() {
        return a + b;
    }
}

public class Atom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Create an instance of the Addition class
        Addition obj = new Addition();

        // Prompt user for input
        System.out.print("Enter first number: ");
        obj.a = scn.nextInt();
        System.out.print("Enter second number: ");
        obj.b = scn.nextInt();

        // Perform addition and display result
        int sum = obj.add();
        System.out.println("Sum: " + sum);
    }
}

// Youtuber obj = new Youtuber();
// Youtuber gg = new Youtuber();
// gg = new Youtuber();
// gg.age = 55;
// gg.age();
// obj.name = "Technaical guru ji";
// obj.Tg();

// }
// }

// class Youtuber {
// String name;
// int age;

// void Tg() {
// System.out.println(name + " A big tech creator ");
// }

// void age() {
// System.out.println("his age is about " + age);
// }
