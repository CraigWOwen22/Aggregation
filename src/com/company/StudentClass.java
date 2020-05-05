package com.company;

public class StudentClass {

    int rollNum;
    String studentName;
    //HAS-A relationship
    Address studentAddress;

    public StudentClass(int rollNum, String studentName, Address studentAddress) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public static void main(String[] args) {
        Address address = new Address(35, "MaesYFfynon", "Abergele", "LL22 9BF");
        StudentClass obj = new StudentClass(47,"Thomas Gwyn Owen", address);

        System.out.println("\nStudent");
        System.out.println("Roll number: "  + obj.rollNum);
        System.out.println("Student name: " + obj.studentName);
        System.out.println("\nStudent address");
        System.out.println("Street number: " + obj.studentAddress.streetNum);
        System.out.println("Street name: " + obj.studentAddress.streetName);
        System.out.println("County: " + obj.studentAddress.county);
        System.out.println("Postcode: " + obj.studentAddress.postcode);




    }
}
