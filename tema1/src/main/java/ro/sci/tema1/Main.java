package ro.sci.tema1;

import ro.sci.tema1.calculator.Calculator;
import ro.sci.tema1.dom.Dom;




public class Main {
    public static void main(String[] args) {

       Calculator calculator = new Calculator();
       calculator.calc();
       System.out.println();
       Dom dom = new Dom ();
       dom.dayofmonth();


                }
}

