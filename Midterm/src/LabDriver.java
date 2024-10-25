/*
 * Code writes a file and reads the data into an ArrayList of the Person object
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import for File Object
import java.io.IOException;  // Import for IO Exceptions
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class LabDriver {
    public static void main(String[] args) {
        //****************************************************************
        //Variables we will use in the program
        //****************************************************************
        ArrayList<Person> Students = new ArrayList<Person>();
        String firstName;
        String lastName;
        int age;
        int index = 0; //index for the ArrayList
        double gpa;
        String phoneNum;

        //****************************************************************
        //Lets create our Data File
        //here we will use a try/catch in the event something goes wrong
        //****************************************************************
        try {
            //Create an instance of the File Writer and give it the filename
            FileWriter myWriter = new FileWriter("Person.txt");
            //Write our data to the file
            myWriter.write("Kevin Roark 29" + 3.87 +" 210-837-0600\n"
                    + "Sam Read 21 2.9 210-398-0098\n"
                    + "Sally Smith 34 3.2 210-356-9822\n"
                    + "Bart Simpson 14 2.1 210-654-2783");
            //close the file we opened - MUST BE DONE
            myWriter.close();
            //Message that all was done
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            //An issue happened - Message user
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //****************************************************************
        //Now lets read the file into our ArrayList of object Person
        //****************************************************************
        try {
            //Create a file object
            File myObj = new File("Person.txt");
            Scanner myReader = new Scanner(myObj);
            //While there is data to read
            while (myReader.hasNextLine())
            {
                //Read in each variable from file
                firstName = myReader.next();
                lastName = myReader.next();
                age = myReader.nextInt();
                gpa = myReader.nextDouble();
                phoneNum = myReader.next();

                //Add as an instance of the person to the ArrayList using the Person Constructor
                Students.add(new Person(firstName, lastName, age));
            }
            //close the file we opened - MUST BE DONE
            myReader.close();
        }
        //If we could not find the file - catch the error
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //****************************************************************
        //Now lets iterate through our ArryList and use the Person PrintData method
        //to show we have our ArrayList of Student Objects
        //****************************************************************
        while (index < Students.size())
        {
            //we iterate through each index and invoke the PrintData method of the Person object
            System.out.println(Students.get(index).PrintData());
            index++;
        } //end of while loop
    }

}