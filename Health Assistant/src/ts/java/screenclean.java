package src.ts.java;
//import java.lang.Runtime.*;
import java.io.*;
public class screenclean {
    public void clearScreen() throws IOException,InterruptedException
    {
        try {

        if (System.getProperty("os.name").contains("Windows"))

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        else

            Runtime.getRuntime().exec("clear");

    } catch (IOException | InterruptedException ex) {}
    }
}