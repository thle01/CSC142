import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class FileInfo here.
 * 
 * @author Nadezhda Rusina 
 * @version 1/29/2017
 */
public class FileInfo
{
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("readme.txt");
        System.out.println("exists returns " + f.exists());
        System.out.println("length returns " + f.length());
        System.out.println("path is " + f.getAbsolutePath());
        Scanner input = new Scanner(f);
        String text = input.nextLine();
        System.out.println(text);
        text = input.nextLine();
        System.out.println(text);
        
    }
}
