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

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Contacts contacts = new Contacts();

        int button = -1;

        do{

            try { //Throws
                System.out.println("****** Contacts Menu ******");
                System.out.println("(1) Show all Contacts");
                System.out.println("(2) Search by last name");
                System.out.println("(3) Search by first name");
                System.out.println("(4) Sort List");
                System.out.println("(5) Quit");
                System.out.println("\nChoose a menu option: ");
                button = scan.nextInt();

                switch (button) {
                    case 1:
                        displayContactList(contacts);
                        break;
                    case 2:
                        searchLastName(contacts);
                        break;
                    case 3:
                        searchFirstName(contacts);
                        break;
                    case 4:
                        System.out.println("~~~~~Sorting~~~~~\n");
                        sortList(contacts);
                        break;
                    case 5:
                        System.out.println("Quit");
                        break;
                    default:
                        System.out.println("Invalid input.  Try again.");
                }
            }catch(InputMismatchException e){ //Retries program
                System.out.println("\nError: Please enter a valid number\n");
                scan.nextLine();
            }
        }while(button != 5); //Exits program
    }

    public static void displayContactList(Contacts contacts){

        System.out.println("****** Contact List ******");
        for(int i = 0; i < contacts.firstName.length; i++){
            System.out.println(contacts.printContacts(i));
        }
        System.out.println("*************************\n");
    }
    public static void searchLastName(Contacts contacts){

        String searchString;
        Scanner scan = new Scanner(System.in);
        boolean lastNameFound = false;

        System.out.println("Enter the person's last name to search: ");
        searchString = scan.nextLine();


        for(int i = 0; i < contacts.lastName.length; i++){
            if(contacts.lastName[i].equalsIgnoreCase(searchString)){
                lastNameFound = true;

                System.out.println("Found last name!");
                System.out.println(contacts.printContacts(i));
            }
        }
        if(!lastNameFound){
            System.out.println("Not Found");
        }
    }
    public static void searchFirstName(Contacts contacts){

        String searchString;
        Scanner scan = new Scanner(System.in);
        boolean firstNameFound = false;

        System.out.println("Enter the person's first name to search: ");
        searchString = scan.nextLine();

        for(int i = 0; i < contacts.lastName.length; i++){
            if(contacts.firstName[i].equalsIgnoreCase(searchString)){
                firstNameFound = true;

                System.out.println("Found first name!");
                System.out.println(contacts.printContacts(i));
            }
        }
        if(!firstNameFound){
            System.out.println("Not Found");
        }
    }
    public static void sortList(Contacts contacts){

        int n = contacts.firstName.length;

        for(int i = 0; i < n - 1; i++){
            for(int a = 0; a < n - 1 - i; a++){
                if(contacts.firstName[a].compareTo(contacts.firstName[a + 1]) > 0){

                    // Swap last name
                    String tempLastName = contacts.lastName[a];
                    contacts.lastName[a] = contacts.lastName[a + 1];
                    contacts.lastName[a + 1] = tempLastName;

                    // Swap first name
                    String tempFirstName = contacts.firstName[a];
                    contacts.firstName[a] = contacts.firstName[a + 1];
                    contacts.firstName[a + 1] = tempFirstName;

                    // Swap email
                    String tempEmail = contacts.email[a];
                    contacts.email[a] = contacts.email[a + 1];
                    contacts.email[a + 1] = tempEmail;
                }
            }
        }
        displayContactList(contacts);
    }
}
