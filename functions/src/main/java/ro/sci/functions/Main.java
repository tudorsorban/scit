package ro.sci.functions;

import ro.sci.functions.math.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test");

        Calculator calculator = new Calculator();

        System.out.println("suma: " + calculator.aduna(3, 4));
        System.out.println("fibonacci: "+ calculator.fibonacci(5));

    }

}
