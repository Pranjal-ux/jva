public class dec {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                System.out.print("* "); // Print asterisk with space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
 