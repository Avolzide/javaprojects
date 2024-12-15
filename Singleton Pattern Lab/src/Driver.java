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

public class Driver {
    public static void main(String[] args) {
        ReportHeader reportHeader = ReportHeader.getInstance();
        reportHeader.printHeader(); // Using the new printHeader method
        // Write report

        ReportFooter reportFooter = ReportFooter.getInstance(); //Using printFooter method similar to Header
        reportFooter.printFooter();
        //End Report
    }
}