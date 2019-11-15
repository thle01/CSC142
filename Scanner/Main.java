import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("What is the file name?");
        String fileName = console.nextLine();
        String text = "C:\\Users\\mynga\\OneDrive\\Desktop\\hienle\\SCC\\Fall 2019\\CSC142\\Oops6_error_example.txt";
        File example = new File(fileName);
        
        Scanner input = new Scanner(example);
        count(input);
    }    
    
    public static void count(Scanner input) {
        int lineCount = 0;
        int wordCount = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            lineCount++;   
            
            Scanner data = new Scanner(line);         
            while(data.hasNext()) {
                String word = data.next();
                wordCount++;            
            }
            
        }
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
    }
}
