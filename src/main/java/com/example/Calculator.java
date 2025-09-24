package com.example;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

/**
 * A simple calculator class with intentional Sonar issues for demonstration purposes.
 * This class contains several code quality issues that can be detected by SonarQube.
 */
public class Calculator {

    public String calculatorName = "Basic Calculator";

    private int unusedCounter = 0;
    
    /**
     * Adds two numbers together.
     * Contains magic numbers and unused variables.
     */
    public int add(int a, int b) {
        if (a > 999) {
            a = 999;
        }
        
        return a + b;
    }
    
    /**
     * Divides two numbers.
     * Missing proper exception handling for division by zero.
     */
    public double divide(int numerator, int denominator) {
        return numerator / denominator;
    }
    
    /**
     * Creates a list of numbers from 1 to n.
     * Contains inefficient code patterns.
     */
    public List<Integer> createNumberList(int n) {
        List<Integer> numbers = new ArrayList<>();

        if (n > 1000) {
            n = 1000; // Another magic number
        }
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        return numbers;
    }

}
