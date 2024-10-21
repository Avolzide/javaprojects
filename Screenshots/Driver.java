/*
 * David Cortinez
 * Module 4 Lab 2
 * Purpose: You have been hired by a school to build a student records management system to keep track of their
 * students' information. Create your class based on the following Class diagram.
 */
/* ***Outline***
 * Create a class called Student that stores the information for each student.

 * Create an ArrayList called StudentRecords in your main that contains a list of Student objects

 * Create a displayAllStudents method in the main that displays all the students in the list.

 * Create the following functionality in your main that does the following:

 * Creates a few Student objects and add to the ArrayList - does not require user input.

 * Calls the displayAllStudents method to display all the students in the list.
 */

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        //Creating an ArrayList of student objects
        ArrayList<Student> StudentRecords = new ArrayList<Student>();

        StudentRecords.add(new Student("Rhul", "Chemistry", "927384769", "Y'shtola", 2026));
        StudentRecords.add(new Student("Leveilleur", "Biology", "36482930", "Alisaie", 2028));
        StudentRecords.add(new Student("Baldesion", "Speech", "637482881", "Krile", 2025));

        //Printing out student objects
        displayAllStudents(StudentRecords);
    }

    //Function for displaying ArrayList objects from Student
    public static void displayAllStudents(ArrayList<Student> student) {

        for (Student StudentList : student) {
            System.out.println(StudentList.printStudentInfo());
        }
    }
}