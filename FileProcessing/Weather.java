import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Weather
{
    public static void main(String[] args) {
        String s = "";
        try 
        {
            Scanner in = new Scanner(new File("weather2.txt"));
            double prev = in.nextDouble();
            double next;
            while(in.hasNextDouble()) {
                next = in.nextDouble();
                s += prev  + " - " + next + " = " + String.format("%.1f",(next-prev)) + "\n";
                prev = next;
            }
            System.out.println(s);
        }
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist " + "weather.txt");
        }
    }
}
