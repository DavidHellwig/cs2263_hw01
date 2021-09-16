/*
 * This Java source file was generated by the Gradle 'init' task.
 */
//Author: David Hellwig
package edu.isu.cs2263.hw01;

import com.sun.jdi.connect.Connector;
import org.apache.commons.cli.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Arrays;

public class App {






    //Setting up the parser and options in main
    //The currently best know way (by contributor David) is to do this
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        options.addOption("h", "help",false,"displays help message");

        options.addOption("b","batch",true , "processes a file provided");

        options.addOption("o","output",true,"sends the output to the provided file");

        CommandLineParser parser = new DefaultParser();
        try{
            CommandLine cmd = parser.parse(options, args);

            if(cmd.hasOption("h")) {
                System.out.println("""
                        usage:eval [Options]
                        Evaluation of mathemematical expressions
                        -b,--batch <file>    batch file containing expressions to evaluate
                        -h,--help            print usage message
                        -o,--output <file>   output file
                        \t\tCopyright (C) 2021 Isaac D. Griffith
                        """);
                System.exit(0);
            }
            else if (cmd.hasOption("b")){
                String temp = Arrays.toString(cmd.getArgs());
                System.out.println("batch:".concat(temp));

            }
            else if (cmd.hasOption("o")){
                String temp = Arrays.toString(cmd.getArgs());
                System.out.println("output:".concat(temp));

        }



        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }






    }
