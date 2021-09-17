package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFileOps implements InputInterface{
    @Override

    //Bad practice
    public void start(){
        return;

        }

    @Override
    public void exit() {

        System.exit(0);

    }
    //Figure out how to get evaluator to accept files
    public void scanFile(File batchfile) throws FileNotFoundException{


        Scanner reader = new Scanner(batchfile.getAbsolutePath());

        try {
            reader = new Scanner(batchfile);

          //Let user know they used an incorrect file name
        } catch (FileNotFoundException e) {

            System.out.println("You used an invalid filename");

            exit();
        }
        Evaluator evaluator = new Evaluator();

        evaluator.Evaluate(reader);


    }


}
