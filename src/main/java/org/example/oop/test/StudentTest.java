package org.example.oop.test;

import org.example.oop.domain.Student;

public class StudentTest {
   public static void main(String[] args) {
    Student student = new Student();

    student.gender = "M";
    student.age = 10;
    student.name = "ion";

    System.out.println(student.age);
   }
}
