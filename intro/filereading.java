package intro;
import java.util.Scanner;

public class filereading {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console (System.in)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine(); // Reads a line of text

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        // Always close the scanner when done
        scanner.close();
    }
}
