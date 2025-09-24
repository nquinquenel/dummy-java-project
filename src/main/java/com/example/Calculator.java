package com.example;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

/**
 * A simple calculator class with intentional Sonar issues for demonstration purposes.
 * This class contains several code quality issues that can be detected by SonarQube.
 */
public class Calculator {
    
    // Sonar Issue #1: Non-private field (should be private for proper encapsulation)
    public String calculatorName = "Basic Calculator";
    
    // Sonar Issue #2: Unused field (dead code)
    private int unusedCounter = 0;
    
    /**
     * Adds two numbers together.
     * Contains magic numbers and unused variables.
     */
    public int add(int a, int b) {
        // Sonar Issue #3: Unused local variable (dead code)
        int unusedVariable = 100;
        String unusedString = "This variable is never used";
        
        // Sonar Issue #4: Magic number (should be defined as a constant)
        if (a > 999) {
            a = 999; // Magic number without explanation
        }
        
        return a + b;
    }
    
    /**
     * Divides two numbers.
     * Missing proper exception handling for division by zero.
     */
    public double divide(int numerator, int denominator) {
        // Sonar Issue #5: Missing exception handling or validation
        // This method should check for division by zero
        return numerator / denominator;
    }
    
    /**
     * Creates a list of numbers from 1 to n.
     * Contains inefficient code patterns.
     */
    public List<Integer> createNumberList(int n) {
        List<Integer> numbers = new ArrayList<>();
        
        // Sonar Issue #6: Magic number in loop condition
        if (n > 1000) {
            n = 1000; // Another magic number
        }
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        return numbers;
    }
    
    /**
     * Main method to demonstrate the calculator functionality.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Calculator: " + calc.calculatorName);
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 / 2 = " + calc.divide(10, 2));
        
        List<Integer> numbers = calc.createNumberList(5);
        System.out.println("Numbers 1-5: " + numbers);
        
        // This will cause an ArithmeticException due to missing exception handling
        // Uncomment the line below to see the issue:
        // System.out.println("10 / 0 = " + calc.divide(10, 0));
    }
}