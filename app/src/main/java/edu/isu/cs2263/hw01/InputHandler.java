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

        if (checkInput.matches("\\b(?i)start\\b")){
            start();
        }
        else if (checkInput.matches("\\b(?i)exit\\b")){
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
