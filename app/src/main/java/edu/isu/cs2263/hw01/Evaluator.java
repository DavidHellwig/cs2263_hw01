//Author:David Hellwig

package edu.isu.cs2263.hw01;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Evaluator {

    public Evaluator(){
        Evaluate();
        }




    //Basic math operations with two numbers
    public int addNumbers(int a,int b){
        return a+b;

    }

    public int subtractNumbers(int a, int b){
        return a-b;
    }

    public int divideNumber(int a, int b){
        return a/b;
    }

    public int multiplyNumber(int a, int b){
        return a*b;
    }

    //Check to see if someone made a mistake and put an operator as the first symbol in their expression
    public void checkForFirstSymbolMistake(ArrayList<String> a) {
        String tester = String.valueOf(a.get(0));
        if (tester.matches("/\\+-\\*")) {
            System.out.println("You used an operator as the first symbol in your expression." +
                    "Please double check your expression.");
            System.exit(0);
        }
    }

    //Check to see if two operators were used in a row
    //And alert the user to this mistake.
    public void checkForDoubleOperator(ArrayList<String> a){
        String tester1 = String.valueOf(a.get(0));
        String tester2 = String.valueOf(a.get(1));

        if (tester1.matches("[/+*-]") && tester2.matches("[/+*-]") ){
            System.out.println("Two operators in a row were found. Aborting evaluation" +
                    "Please double check your expression.");
            System.exit(0);
        }


    }
    //Just print results of expression
    public void showResults(int a){
        System.out.println(a);
    }
    //Evaluate expression
    public void Evaluate(){

        Scanner scanner = new Scanner(System.in);

        String[] stringBreaker = scanner.nextLine().split("[+/*-]");

        int i = 0;

        int j = stringBreaker.length;

        int Memory = 0;

        //Read symbol by symbol to figure out what to do next. Does not consider order of operations
        while (i < j){

            try {
                //checkForDoubleOperator(inputMemory);
                if (stringBreaker[i + 1].equals("/")) {

                    Memory += divideNumber(Integer.parseInt(stringBreaker[i]), Integer.parseInt(stringBreaker[i + 2]));
                    i = i + 3;

                    break;


                } else if (stringBreaker[i + 1].equals("+")) {
                    Memory += addNumbers(Integer.parseInt(stringBreaker[i]), Integer.parseInt(stringBreaker[i + 2]));

                    i = i + 3;

                    break;
                } else if (stringBreaker[i + 1].equals("-")) {
                    Memory += subtractNumbers(Integer.parseInt(stringBreaker[i]), Integer.parseInt(stringBreaker[i + 2]));
                    i = i + 3;

                    break;
                } else if (stringBreaker[i + 1].equals("*")) {
                    Memory =+ multiplyNumber(Integer.parseInt(stringBreaker[i]), Integer.parseInt(stringBreaker[i + 2]));
                    i = i + 3;

                    break;
                } else {
                    i += 1;
                }
            }
            catch (IndexOutOfBoundsException e){
                showResults(Memory);
                System.exit(0);



            }





        }



    }

}

