package com.company;
/**
 * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 *
 * @author Parham
 * @version 1.0
 */
public class student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;
    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student ID
     */
    public student(String fName, String lName, String sID){
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;
    }
    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName){
        firstName = fName;
    }
    /**
     * get the last name of student
     * @return LastName field
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * @param lName set last name of a student
     */
    public void setLastName(String lName){
        lastName = lName;
    }
    /**
     * get the id of student
     * @return id field
     */
    public String getId(){
        return id;
    }
    /**
     * @param sID set id of a student
     */
    public void setId(String sID){
        id = sID;
    }
    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade(){
        return grade;
    }
    /**
     * @param sGrade set grade of a student
     */
    public void setGrade(int sGrade){
        grade = sGrade;
    }
    /**
     * Print the student’s last name and ID number to the
     output terminal.
     */
    public void print(){
        System.out.println(firstName + " " + lastName + ", student ID: " + id + ", grade: " + grade);
    }

}
