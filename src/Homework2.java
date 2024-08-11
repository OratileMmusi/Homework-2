import java.util.Scanner;

/**
 * Student Name: Oratile Mmusi
 * Student Number: ST10312691
 * Assignment Name: Homework 1
 * Submission due date: 04 Aug 2024
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        String name; 
        int age; 
        
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read user input
        System.out.println("Please enter a person's name:");
        name = input.nextLine(); // Read the entire line as a string
        
        System.out.println("Please enter a person's age:");
        age = input.nextInt(); // Read the integer value for age
        
        // Determine age category and output result
        if (age < 1) {
            System.out.println(name + " is an infant");
        } else if (age >= 1 && age <= 3) {
            System.out.println(name + " is a toddler");
        } else if (age >= 4 && age <= 5) {
            System.out.println(name + " is a preschooler");
        } else if (age >= 6 && age <= 12) {
            System.out.println(name + " is a grade schooler");
        } else if (age >= 13 && age <= 18) {
            System.out.println(name + " is a teenager");
        } else if (age >= 19 && age <= 21) {
            System.out.println(name + " is a young adult");
        } else {
            System.out.println(name + " is an adult");
        } 
        
        // Close the scanner
        input.close();
    }
}
