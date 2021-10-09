package com.company;

public class Run {
    public static void main(String[] args){
        student std1 = new student("Parham", "Mirvakili", "9931057");
        student std2 = new student("Amirali", "Atrli", "9931058");
        student std3 = new student("Behdad","Etezadi","9931059");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        System.out.println("____________________________________________________");

        Lab lb1 = new Lab(20,"16/12/99");
        lb1.enrollStudent(std1);
        lb1.enrollStudent(std2);
        lb1.enrollStudent(std3);
        lb1.calculateAvg();
        lb1.print();

        System.out.println("____________________________________________________");

        professor p1 = new professor("Ali","Mohammadi",3);
        p1.enrollStudent(std1);
        p1.enrollStudent(std2);
        p1.enrollStudent(std3);
        p1.print();

    }
}
