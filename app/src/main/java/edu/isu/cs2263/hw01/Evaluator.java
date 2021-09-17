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
    public double getMemory(double d){
        return d;
    }
    //Evaluate expression
    public double Evaluate(Scanner s){

        String[] stringBreaker = s.nextLine().split("\s");

        int i = 0;

        int j = stringBreaker.length;

        double Memory = 0;


        //Read symbol by symbol to figure out what to do next. Does not consider order of operations
        //Assumes you made no error in inputting numbers and symbols
        Memory = Memory + Double.parseDouble(stringBreaker[0]);
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

        System.out.println(Memory);

        return Memory;




    }

}

