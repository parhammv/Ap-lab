package com.company;

/**
 * The Student class represents a student in a laboratory
 * @author Parham
 * @version 1.0
 */
public class professor {
    private String firstName;
    private String lastName;
    private student[] students;
    private int number_of_students;
    private int current_number;

    /**
     * creates a professor
     * @param fName the first name of prof
     * @param lName the last name of prof
     * @param Number_of_students the number of students he teaches
     */
    public professor(String fName, String lName, int Number_of_students) {
        firstName = fName;
        lastName = lName;
        number_of_students = Number_of_students;
        students = new student[number_of_students];
        current_number = 0;
    }

    /**
     * adds an student to prof's students
     * @param std new student
     */
    public void enrollStudent(student std) {
        if (current_number < number_of_students) {
            students[current_number] = std;
            current_number++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }
    /**
     * get the first name of prof
     * @return firstName path
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * set the prof's fist name
     * @param fName prof's first name
     */
    public void setFirstName(String fName){
        firstName = fName;
    }

    /**
     * get prof's last name
     * @return lastName path
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * set prof's last name
     * @param lName prof's last name
     */
    public void setLastName(String lName){
        lastName = lName;
    }

    /**
     * prints prof's students information
     */
    public void print() {
        for (int i = 0;i<current_number;i++)
            students[i].print();
    }

    /**
     * get students list
     * @return students path
     */
    public student[] getStudents() {
        return students;
    }

    /**
     * set the students list
     * @param Students students list
     */
    public void setStudents(student[] Students) {
        if (current_number >= 0) System.arraycopy(Students, 0, students, 0, current_number);
    }
}
