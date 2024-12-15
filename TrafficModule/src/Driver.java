/*
* David Cortinez
* Module 8 Lab 2
* Purpose: * implement the code for the HighTraffic and MediumTraffic classes and add to driver
*
* *** Outline ***

MediumTraffic Class:



// Represents a medium traffic condition. Implements TrafficState for medium
// travel conditions.
// Your multiplier for the distance is 3
//Your message for the user in the getDirection is to
// suggests using a mix of main roads and side streets.
HighTraffic Class



// Represents a high traffic condition. Implements TrafficState for slow
// travel conditions.
// Your multiplier for the distance is 5
// Your message for the user in the getDirection is to
// suggests using side streets to avoid heavy traffic on main roads.
// TODO - Create the HighTraffic Class
Driver:



Modify the Switch conditions 3, and 4 (the TODO sections) to accommodate the new
states you have created
 */

import java.util.Scanner; // Import Scanner class for reading input

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize the DirectionService with a default state, such as LowTraffic.
        DirectionService service = new DirectionService(new LowTraffic(), 0);
        int choice = 0; // user selection (user menu choice)

        while (true) {
            System.out.println("Select the traffic condition:");
            System.out.println("1. No Traffic");
            System.out.println("2. Low Traffic");
            System.out.println("3. Medium Traffic");
            System.out.println("4. High Traffic");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt(); // Read user choice

            if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            }



            System.out.print("Enter the distance in miles: ");
            int distance = scanner.nextInt(); // Read distance input
            service.setDistance(distance); // Update the distance in the existing service object.

            switch (choice) {
                case 1:
                    service.setTrafficState(new NoTraffic());
                    break;
                case 2:
                    service.setTrafficState(new LowTraffic());
                    break;
                case 3:
                    service.setTrafficState((new MediumTraffic()));
                    //TODO handle Medium Traffic State
                    break;
                case 4:
                    service.setTrafficState(new HighTraffic());
                    //TODO handle the High Traffic State
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    continue;
            }

            // Output the results for the chosen traffic condition and distance
            System.out.println("Current Traffic State: " + service.getCurrentState().getClass().getSimpleName());
            System.out.println("ETA: " + service.getETA() + " minutes");
            System.out.println("Directions: " + service.getDirection());
            System.out.println(); // Blank line for readability
        }

        scanner.close(); // Close the scanner
    }
}

