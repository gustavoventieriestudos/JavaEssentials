package org.example.introduction;

import java.util.Arrays;

public class Class11Arrays {
    public static void main(String[] args) {
        int[] ages = new int[3];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
        }
        System.out.println(Arrays.toString(ages));
    }


}
