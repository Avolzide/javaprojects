/*
* David Cortinez
* Module 4 CLO5/6
* Purpose: In this lab, you will create a simple Contacts list program using parallel arrays in Java.
* The program will allow users to manage a list of contacts and perform basic operations such as viewing all contacts,
* searching by last name, searching by first name, and quitting the program.
 */
/* *** Outline ***
* Data Points for Contacts:

First Name

Last Name

Email

Phone Number

Preparation:
You can go ahead and pre-populate the Contact information with five sample contacts.

Menu Options:
Your program will have the following menu options:

Show all Contacts

Search contacts based on the last name

Search contacts based on the first name

Quit program

Program User Prompts:

The program will display the menu options to the user.

The user can enter the number corresponding to the desired operation (1, 2, 3, or 4).

If the user enters an invalid input (not 1, 2, 3, or 4), the program will display an appropriate error message and ask the user to enter again.

Functionality:

Show all Contacts:

When the user selects option 1, the program will display all the contacts in the list, showing all the data points (First Name, Last Name, Email, Phone Number) for each contact.

The program will display the contacts in a clear and formatted manner, making it easy for the user to read.

Search contacts based on the last name:

When the user selects option 2, the program will prompt the user to enter the last name they want to search for.

The program will then search the Contacts list for all contacts with the specified last name and display the matching contacts along with their data points (First Name, Last Name, Email, Phone Number).

If no contacts with the given last name are found, the program will display a message indicating that no matches were found.

Search contacts based on the first name:

When the user selects option 3, the program will prompt the user to enter the first name they want to search for.

The program will then search the Contacts list for all contacts with the specified first name and display the matching contacts along with their data points (First Name, Last Name, Email, Phone Number).

If no contacts with the given first name are found, the program will display a message indicating that no matches were found.

Quit program:

When the user selects option 4, the program will gracefully exit, ending the loop and terminating the program.
 */

public class Contacts {

    public void printContacts(){
        String str = "\nFirst Name: " + firstName[1] +
                     "\nLast Name: " +
                     "\nEmail: " +
                     "\nPhone Number: ";
    }
}