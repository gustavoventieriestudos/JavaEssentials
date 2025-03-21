package org.example;

public class Class13MultidimensionalArray {
    public static void main(String[] args) {
        int days[][] = new int[10][10];

        days[1][1] = 10;
        days[2][2] = 20;

       for (int line = 0; line < days.length; line++) {
            for (int column = 0; column < days.length; column++) {
                if(days[line][column] != 0) System.out.println(days[line][column]);
               
            }
       }
    }
}
