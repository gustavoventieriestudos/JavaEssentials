package org.example;

public class Class04ConditionalStatements2 {
    public static void main(String[] args) {
        // age < 15 category junior
        // age >=15 && age < 18 category senior
        // age >= 18 category masters
        int age = 20;
        String category;
        if (age < 15) {
            category = "Category Junior";
        } else if (age >= 15 && age < 18) {
            category = "Category Senior";
        } else {
            category = "Category Master";
        }
        System.out.println(category);
    }
}

