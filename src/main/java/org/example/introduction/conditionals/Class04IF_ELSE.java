package org.example.introduction.conditionals;

public class Class04IF_ELSE {
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

