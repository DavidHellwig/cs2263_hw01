//Author:David Hellwig

package edu.isu.cs2263.hw01;

import java.util.*;


public class Evaluator {

    public Evaluator(){

        }




    //Basic math operations with two numbers
    public double addNumbers(double a,double b){
        return a+b;

    }

    public double subtractNumbers(double a, double b){
        return a-b;
    }

    public double divideNumber(double a, double b){
        return a/b;
    }

    public double multiplyNumber(double a, double b){
        return a*b;
    }


    //Just print results of expression
    public void showResults(double a){
        System.out.println(a);
    }
    //Evaluate expression
    public void Evaluate(Scanner s){

        String[] stringBreaker = s.nextLine().split("");

        int i = 0;

        int j = stringBreaker.length;

        double Memory = 0;


        //Read symbol by symbol to figure out what to do next. Does not consider order of operations
        //Assumes you made no error
        Memory = Double.parseDouble(Memory + stringBreaker[0]);
        while (i+2 < j){

            try {

                Memory = switch (stringBreaker[i + 1]) {
                    case "/" -> divideNumber(Memory, Double.parseDouble(stringBreaker[i + 2]));
                    case "+" -> addNumbers(Memory, Double.parseDouble(stringBreaker[i + 2]));
                    case "-" -> subtractNumbers(Memory, Double.parseDouble(stringBreaker[i + 2]));
                    case "*" -> multiplyNumber(Memory, Double.parseDouble(stringBreaker[i + 2]));
                    default -> Memory;
                };
                i+=2;

            }
            catch (IndexOutOfBoundsException e){

                System.exit(0);


            }
        }
        //Due to the nature of doubles answer is off by a factor of 100. But allows for decimals
        showResults(Memory*100);



    }

}

