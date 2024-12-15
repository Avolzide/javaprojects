/*
* David Cortinez
* Module 8 Lab 1
* Purpose: In this lab, you will extend the provided Report Writer application which currently includes a Singleton
* class ReportHeader for generating report headers. You are to add another Singleton class for generating report footers named ReportFooter
*
* *** Outline ***
* Start by examining the existing ReportHeader Singleton class to understand how it is implemented.

Create a new Singleton class called ReportFooter. This class should be structured similarly to the ReportHeader class.

It should have a private constructor.

It should have a private static volatile instance of ReportFooter.

It should have a public static method, getInstance(), that returns the instance of ReportFooter, instantiating it if it is null.

It should contain a private String footer that is initialized in the constructor with the contents of the footer (for example, "Company Name\nAddress\nEnd of Report\n\n").

It should have a printFooter() method that prints footer to the console.

Update the driver class to demonstrate the use of the new ReportFooter class. After printing the header, it should retrieve the footer using ReportFooter.getInstance() and print it using the printFooter() method.

Test your application to ensure that it behaves as expected.
 */

// Class to handle the singleton instance of ReportHeader
public class ReportFooter {
    // Static variable to hold the single instance, marked as volatile to ensure visibility
    // of changes across threads.
    private static volatile ReportFooter instance;
    // Private variable to hold the header text
    private String footer;
    // Private constructor to prevent instantiation from outside the class
    private ReportFooter() {
        // Initializes the header string with specific details
        this.footer = "Strawberry Productions\n123 West Lane, Dallas TX, 77777\nEnd of Report\n";
    }
    // Public method to get the singleton instance
    public static ReportFooter getInstance() {
        // First check to see if an instance already exists without locking
        if (instance == null) {
            // Synchronize on the class object to ensure only one thread can enter
            // this block at a time.
            synchronized (ReportFooter.class) {
                // Double check to make sure the instance was not created in another thread
                // while the current thread was waiting on the class' lock.
                if (instance == null) {
                    // If the instance is still null, create a new one
                    instance = new ReportFooter();
                }
            }
        }
        // Return the instance
        return instance;
    }
    // Getter method for the header string
    public String getFooter() {
        return this.footer;
    }
    // Method to print the header to the console
    public void printFooter() {
        System.out.println(this.footer);
    }
}