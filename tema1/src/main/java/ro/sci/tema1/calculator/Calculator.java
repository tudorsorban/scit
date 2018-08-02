package ro.sci.tema1.calculator;

import java.util.Scanner;

public class Calculator {

    public void calc() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers: ");


        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        double result;

        switch (operator) {

            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            default:
                System.out.printf("Error! operator is not correct");
                return;

        }
        System.out.printf("%.1f %c %.1f = %.2f", first, operator, second, result);
    }


    }




