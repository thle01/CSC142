import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class FileInfo here.
 * 
 * @author Nadezhda Rusina 
 * @version 1/29/2017
 */
public class FileInfo1
{
    public static Scanner input;
    public static void main(String[] args) {
        File f = new File("readme.txt");
        System.out.println("exists returns " + f.exists());
        System.out.println("length returns " + f.length());
        System.out.println("path is " + f.getAbsolutePath());       
        try {   
            input = new Scanner(f);
            int count=0;
            while (input.hasNextLine()) {
                String text = input.nextLine();
                System.out.println(text);
                count++;
            }
            System.out.println("Total line = " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.toString());
        }
        input.close();
    }
}
