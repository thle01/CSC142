import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
/**
 * Hours Worked class
 *
 * @author Hien Le
 * @version 11/1/2019
 */
public class Main
{
    public static final int DAYSINWEEK = 7;
    
    public static void main(String[] args) throws FileNotFoundException {
        String d = "C:\\Users\\mynga\\OneDrive\\Desktop\\hienle\\SCC\\Fall 2019\\CSC142\\HoursWorked\\data.txt";
        File f = new File(d);
        Scanner input = new Scanner(f);
        readText(input);
    }
    
    public static void readText(Scanner input)
    {
        int[] total = new int[DAYSINWEEK];
        int personNumber = 1;
        int totalHours = 0;
        while(input.hasNextLine()) {
            String text = input.nextLine();
            int[] next = transferFrom(text);            
            addTo(total,next);
            int totalHoursPerson = 0;
            for (int i = 0; i <DAYSINWEEK; i++) {
                totalHoursPerson += next[i];
            } 
            
            System.out.println("Total hours worked of person " + personNumber + " is " + totalHoursPerson);
            personNumber++;
        }
        String[] day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (int i = 0; i <DAYSINWEEK; i++) {
            System.out.println(day[i] + " total hours is " + total[i]);
            totalHours += total[i];
        } 
        
        System.out.println("Total hours is " + totalHours);
         
    }
    
    public static int[] transferFrom(String text) {
        Scanner line = new Scanner(text);
        int[] a = new int[DAYSINWEEK];
        int i = 0;
        while (line.hasNextInt()) {
            a[i] = line.nextInt();
            i++;
        }
        return a;
    }
    
    public static void addTo(int[] total, int[] next) {
        for (int i = 0; i <DAYSINWEEK; i++) {
                total[i] += next[i];
        }
    }
}
