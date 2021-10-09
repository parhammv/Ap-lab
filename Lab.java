package com.company;
/**
 * The Lab class represents a laboratory.
 * It holds the laboratory details relevant in our context.
 *
 * @author Parham
 * @version 1.0
 */
public class Lab {
    private student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    /**
     * Create a new student with a given name and ID number.
     *
     * @param cap capacity of laboratory
     * @param d the date
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        currentSize = 0;
        avg = 0;
        students = new student[cap];
    }

    /**
     * adds a student to the laboratory
     * @param std the student
     */
    public void enrollStudent(student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * prints information about students of the lab and the average of their grades
     */
    public void print() {
        for (int i = 0;i<currentSize;i++)
            students[i].print();
        System.out.println("Lab AVG: " + avg);
    }

    /**
     * get the list of students
     * @return students field
     */
    public student[] getStudents() {
        return students;
    }

    /**
     * set the list of students
     * @param Students list of students
     */
    public void setStudents(student[] Students) {
        if (currentSize >= 0) System.arraycopy(Students, 0, students, 0, currentSize);
    }

    /**
     * get the average grade of lab
     * @return avg field
     */
    public int getAvg(){
        return avg;
    }

    /**
     * calculates the average grade
     */
    public void calculateAvg(){
        int sum = 0;
        for (int i = 0;i<currentSize;i++)
            sum+=students[i].getGrade();
        avg = sum/currentSize;
    }

    /**
     * get the date
     * @return day field
     */
    public String getDay() {
        return day;
    }

    /**
     * set the date
     * @param d the date
     */
    public void setDay(String d){
        day = d;
    }

    /**
     * get the capacity of the lab
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * set the capacity of the class
     * @param capacity capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

