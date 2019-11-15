/**
 * Lab02
 *
 * @author Hien Le
 * @version 10/02/19
 */
import java.util.Random;
import java.awt.*;

public class Main
{
    /**
     * Main method to execute part A, B, C of lab 02
     *

     */
    public static void main(String[] args)
    {
        lab02A();
        lab02B();
        lab02C();
    }

    /**
     * Lab 2 part A
     *
     */
    public static void lab02A()
    {
        String s = "letterhead";
        
        System.out.println("Given string " + s);
        
        //1.Write the expression to find index of the character ‘h’.
        System.out.println("The index of the character 'h' is " + s.indexOf("h"));
        
        //2.Write the expression to retrieve the character ‘r’ from the String.
        System.out.println("The index 5 of the String is " + s.charAt(5));
        
        //3.Write the expression to get the substring “ette”.
        System.out.println("The index from 1 to 5 of the String is " + s.substring(1,5));
        
        //4.Write the expression to find the index location of the last 'e'.
        System.out.println("The index location of the last 'e' is " + s.lastIndexOf("e"));
        
    }

    /**
     * Lab 2 part B
     *
     */
    public static void lab02B()
    { 
        //1.Write the expression to calculate e1.7
        double res = Math.pow(Math.E, 1.7);
        System.out.printf("Math constant e to the power 1.7 is %.2f\n",res);
        
        //2.Write the expression to find the larger of two values x and y
        int x = 1, y = 2;
        System.out.println("The maximum between " + x + " and " + y + " is " + Math.max(x,y));
        
        //3.Write the expression to generate a random number in the range [0.0, 1.0)
        System.out.println("A random number in the range [0.0, 1.0) is " + Math.random());
        
        //4.Write the expression to generate a random number in the range [0.0, 20.0) (hint: this won’t be a new method, but will require some math after you make the call).
        System.out.println("A random number in the range [0.0, 20.0) is " + Math.random() * 20);
        
        //5.Write the expression to generate a random number in the range [5.0, 6.0) (same hint as before).
        System.out.println("A random number in the range [5.0, 6.0) is " + (Math.random() + 5));
        
        //6.Write the expression to generate a random number in the range [10.0, 15.0) (think about combining the 2 steps from 4 and 5).
        System.out.println("A random number in the range [10.0, 15.0) is " + (Math.random() * 5 + 10));
        
        //7.Write the expression to generate a random integer in the range [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("A random integer in the range [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] is " + ((int)(Math.random() * 10) + 1));
    
        Random r = new Random();
        int num;
        num = r.nextInt(10);
        System.out.println("Another way to generate random integer in the range [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] is to use Random which generate " + num);
       
    }

    /**
     * lab 2 part c
     *
     */
    public static void lab02C()
    {
       //1.Write a statement to instantiate a Point object with coordinates (3, 4) and binding it to an appropriate reference variable.
       Point p = new Point(3,4);
       System.out.println("The point is " + p);
       
       //2.What package do you need to import to use a Point object?
       System.out.println("The package needed is import java.awt.*");
       
       //3.What are the coordinates of a Point object if you don't specify any? (0,0)
       System.out.println("The coordinates of a Point object if you don't specify any is [x=0,y=0]");
    }

}
