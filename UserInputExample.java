// This program demonstrates getting user input using BufferedReader and Scanner in Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        try {
            // Using BufferedReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name using BufferedReader:");
            String nameBufferedReader = reader.readLine();
            System.out.println("Your name (BufferedReader): " + nameBufferedReader);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // Using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name using Scanner:");
        String nameScanner = scanner.nextLine();
        System.out.println("Your name (Scanner): " + nameScanner);

        scanner.close();
    }
}
