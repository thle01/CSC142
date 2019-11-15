import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class FileOutput here.
 * 
 * @author Nadezhda Rusina 
 * @version 1/29/2017
 */
public class FileOutput
{
    public static Scanner input;
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream(new File("test.txt"));
            output.println("This is an example.");
        } catch (FileNotFoundException e) {
            System.out.println( e.toString());
        }
    }
}
