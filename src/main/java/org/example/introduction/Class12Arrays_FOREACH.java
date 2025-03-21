package org.example.introduction;


public class Class12Arrays_FOREACH {
    public static void main(String[] args) {
        int[] ages = new int[3];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i+2;
        }
        for (int age: ages){
            System.out.println(age);
        }
    }
}
