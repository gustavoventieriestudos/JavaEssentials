package org.example.oop.static_modifier.test;

import org.example.oop.static_modifier.domain.Calculator;

public class CalculatorTest {
      public static void main(String[] args) {
        // Chamando o método estático 'somar' da classe Calculadora
        int result = Calculator.sum(0, 2);
        System.out.println("Resultado da soma: " + result);
    }
}
