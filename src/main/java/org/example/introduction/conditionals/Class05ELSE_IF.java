package org.example.introduction.conditionals;

public class Class05ELSE_IF {
    public static void main(String[] args) {
        // if salary > 2000 "buy ps5" "don't buy ps5"
        double salary = 3000D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";
        // (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
    }
}
