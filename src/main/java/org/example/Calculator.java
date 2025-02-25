package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException();
        } else {
            return a/b;
        }
    }

    public double squareroot(int a){
        if(a == 0) {
            throw new IllegalArgumentException();
        } else {
            return Math.sqrt(a);
        }
    }


    public int square(int a) {
        return a*a;
    }


    public static double calculateSinus(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    public static double calculateCosinus(double angleInRadians) {
        return Math.cos(angleInRadians);
    }
}
