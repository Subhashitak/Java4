import java.util.Scanner;

public class event_names {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Define the number of attendees
        final int NUM_ATTENDEES = 5;
        
        // Create an array to store the names
        String[] names = new String[NUM_ATTENDEES];
        
        // Prompt user to enter names
        System.out.println("Enter the names of " + NUM_ATTENDEES + " attendees:");

        // Read names from the user
        for (int i = 0; i < NUM_ATTENDEES; i++) {
            System.out.print("Name for attendee " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]+" ");
        }
        
        // Find and print the longest name
        String longestName = findLongestName(names);
        // Find and print the shortest name
        String shortestName = findShortestName(names);
        
        // Print names in reverse order
        System.out.print("Names in Reverse Order: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
        }
        System.out.println();
        
        // Print the longest and shortest names
        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
        
        // Close the scanner
        scanner.close();
    }

    // Method to find the longest name
    private static String findLongestName(String[] names) {
        String longest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }
        return longest;
    }

    // Method to find the shortest name
    private static String findShortestName(String[] names) {
        String shortest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length() < shortest.length()) {
                shortest = names[i];
            }
        }
        return shortest;
    }
}
