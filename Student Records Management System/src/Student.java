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

public class Student{

    //Variables
    private String lastName;
    private String course;
    private String studentID;
    private String firstName;
    private int yearOfGraduation;

    //Parameterized constructor
    public Student(String lastName, String course, String studentID, String firstName, int yearOfGraduation){
        this.lastName = lastName;
        this.course = course;
        this.studentID = studentID;
        this.firstName = firstName;
        this.yearOfGraduation = yearOfGraduation;
    }
    //Default constructor
    public Student(){
        this.lastName = "Wyrmblood";
        this.course = "Acrobatics League";
        this.studentID = "47AG00NN";
        this.firstName = "Estinien";
        this.yearOfGraduation = 2024;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
    public String printStudentInfo(){
        String str = "\n***** Student Information *****" +
                     "\nStudent Name: " + getFirstName() + " " + getLastName() +
                     "\nStudent ID: " + getStudentID() +
                     "\nCourse: " + getCourse() +
                     "\nYear of Graduation: " + getYearOfGraduation();
        return str;
    }
}
