//Author:David Hellwig

package edu.isu.cs2263.hw01;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public void showResults(ArrayList<Integer> a){
        System.out.println(a.get(0));
    }
    //Evaluate expression
    public void Evaluate(){
        int initialCapacity = 1000;

        //ArrayList<String> inputMemory = new ArrayList<>(initialCapacity);

        ArrayList<Integer> Memory = new ArrayList<>(2);


        Scanner scanner = new Scanner(System.in);

        String stringBreaker = scanner.nextLine();

        ArrayList<String> inputMemory = new ArrayList<>(Arrays.asList(stringBreaker.split("[/*+-]")));


        Memory.add(Integer.parseInt(inputMemory.remove(0)));

        //Read symbol by symbol to figure out what to do next. Does not consider order of operations
        do {

            //checkForDoubleOperator(inputMemory);
            if (inputMemory.get(0).equals("/")){
                Memory.add(divideNumber(Memory.remove(0), Integer.parseInt(inputMemory.remove(1))));
                inputMemory.remove(0);
                inputMemory.remove(1);

                break;

            }
            else if (inputMemory.get(0).equals("+")){
                Memory.add(addNumbers(Memory.remove(0), Integer.parseInt(inputMemory.remove(1))));
                inputMemory.remove(0);
                inputMemory.remove(1);

                break;
            }
            else if (inputMemory.get(0).equals("-")){
                Memory.add(subtractNumbers(Memory.remove(0), Integer.parseInt(inputMemory.remove(1))));
                inputMemory.remove(0);
                inputMemory.remove(1);

                break;
            }
            else if (inputMemory.get(0).equals("*")){
                Memory.add(multiplyNumber(Memory.remove(0), Integer.parseInt(inputMemory.remove(1))));
                inputMemory.remove(0);
                inputMemory.remove(1);

                break;
            }




        }while (inputMemory.size() != 0 );
        showResults(Memory);


    }

}

