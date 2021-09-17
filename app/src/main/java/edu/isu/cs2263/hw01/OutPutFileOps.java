//Author:David Hellwig

package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutPutFileOps implements OutputInterface{
    @Override
    //Start the output operation
    public void beginOutput(File f) throws IOException {

        double anotherDouble = operateThenOutPut();

        writeResults(f, anotherDouble);


    }
    //check to see if a file exists, if it doesn't then make it
    public File checkValidFile (File f) throws IOException {

        if (!f.exists()){
            System.out.println("This file does not exist, creating file.");

            File file = new File(f.getName());

            file.createNewFile();

        }
        return f;

    }
    //Run expression and return result
    public Double operateThenOutPut(){

        Scanner scanner = new Scanner(System.in);

        Evaluator evaluator = new Evaluator();

        Double d = evaluator.Evaluate(scanner);

        return d;

    }
    //Write results to a file
    public void writeResults(File f, Double d) throws IOException {

        checkValidFile(f);

        FileWriter writer = new FileWriter(f.getName());

        writer.write(d.toString());

        writer.close();

    }

}
