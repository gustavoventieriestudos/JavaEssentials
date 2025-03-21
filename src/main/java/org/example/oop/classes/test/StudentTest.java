package org.example.oop.classes.test;

import org.example.oop.classes.domain.Student;

public class StudentTest {
   public static void main(String[] args) {
   Student student = new Student();
   Student student2 = new Student();

    student.gender = "M";
    student.age = 10;
    student.name = "ion";

    student2.gender = "F";
    student2.age = 12;
    student2.name = "Ls";

    student.print();
   }
}
