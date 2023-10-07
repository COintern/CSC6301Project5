import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;

/**
 * The program reads a list of integers from the user and stores them in a
 * Stack, then sorting them in ascending order, and prints the sorted list.
 *
 * * This program demonstrates the following steps:
 * 1. Read a list of integers from the user until a non-integer input is encountered.
 * 1.1. It keeps reading multiple lines until the non-integer is enter.
 * 2. Store the integers in a Stack data structure.
 * 3. Sort the Stack in ascending order using the Collections.sort() method.
 * 4. Print the sorted list from smallest to largest.
 * 
 * Quick note: I try to keep the changes to a minimum hopefully it works with a stack in the same fashion
 * 
 * @author Christian O
 */
public class SortedStack {
    /**
     * Main method to execute the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Stack to store the numbers
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter a list of integers. (Ex= 6 5 7 4) (type a non-integer to stop and display results):");

        // Read integers until a non-integer input is encountered
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.push(num);
        }

        // Sort the Stack in ascending order using a temporary LinkedList
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted Stack:");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop() + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
