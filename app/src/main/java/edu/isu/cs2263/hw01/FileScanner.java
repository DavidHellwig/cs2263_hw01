package edu.isu.cs2263.hw01;

import java.io.File;
import java.util.Scanner;

public class FileScanner implements InputInterface{
    @Override


    public void start() {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());



    }

    @Override
    public void exit() {
        System.exit(0);

    }
}
