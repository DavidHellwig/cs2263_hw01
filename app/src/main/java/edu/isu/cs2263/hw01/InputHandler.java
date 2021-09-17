//Author: David Hellwig

package edu.isu.cs2263.hw01;


import java.util.Scanner;

public class InputHandler implements InputInterface{
    //Create object to handle input
    public InputHandler(){
        scanInput();
    }
    //Scan to decide to start or exit
    public void scanInput(){
        Scanner scanner = new Scanner(System.in);

        String checkInput = scanner.nextLine();

        if (checkInput.matches("\s*\\b(?i)start\\b\s*")){
            start();
        }
        else if (checkInput.matches("\s*\\b(?i)exit\\b\s*")){
            exit();
        }
    }

    @Override
    public void start() {
        Evaluator evaluator = new Evaluator();
        Scanner scanner = new Scanner(System.in);
        evaluator.Evaluate(scanner);
    }

    @Override
    public void exit() {
        System.exit(0);

    }


}
