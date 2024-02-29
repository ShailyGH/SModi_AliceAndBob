/**
 * Created by Shaily Modi on 02/28/2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();

        // call the compute() method on that new object
        main.compute();
    }

    public void compute() {
        // Get input string of name from user
        boolean isNameValid = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Create conditional to check name against Alice and Bob
        if (name.equals("Alice") || name.equals("Bob"))
        {
            isNameValid = true;
        }
        // Print greeting to screen if Alice or Bob are true
        if (isNameValid)
        {
            System.out.println("Hello, " + name + "!");
        }
        else
        {
            System.out.println("You are neither Alice nor Bob.");
        }

    }
}
