//Author David Hellwig

package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.IOException;

//Create interface for outputting to a file

public interface OutputInterface {

    void beginOutput(File f) throws IOException;
}

