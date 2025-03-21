package org.example.oop.methods.test;

import org.example.oop.methods.domain.Calculator;

public class CalculatorTest {

    

    public static void main(String[] args) {
       Calculator calculator = new Calculator();

       System.out.println(calculator.subtractTwoNumbers(10, 20));
       System.out.println(calculator.sumTwoNumbers(20, 2));
       System.out.println(calculator.divideTwoNumber(10, 3));
       System.out.println(calculator.multiplyTwoNumber(10, 10));

    }


}
