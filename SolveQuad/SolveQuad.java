import java.util.Scanner;
/**
 * Class SolveQuad will output 3 different scenarios base on the value of coefficient a,b,c
 *
 * @author Hien Le (hien.t.le3@)
 * @version 10/09/2019 - CSC 142 - Lab 03
 */
public class SolveQuad 
{
    public static void main(String[] args) {
        solveQuad();
    }

    /**
     * Method solveQuad will prompt for input from the users: 3 int that is not equal to 0 to calculate the value of x
     *
     */
    public static void solveQuad() {
        Scanner console = new Scanner(System.in);
        double a,b,c;
        System.out.println("I need the 3 co-efficients of the quadaratic funtion a*x^2 + b*x + c to solve for x");
        System.out.println("Please input the first co-efficients of the quadaratic funtion: a");
        a = console.nextDouble();
        System.out.println("Please input the first co-efficients of the quadaratic funtion: b");
        b = console.nextDouble();
        System.out.println("Please input the first co-efficients of the quadaratic funtion: c");
        c = console.nextDouble();
        
        if (a==0 || b==0 || c==0) {
            System.out.println("This is not a Standard Form of Quadratic Equation! ");
            System.exit(0); //Stop the program
        }
        
        double discriminantNum = b*b-4*a*c; //Calculating discriminant
        double x1 = (-b + Math.sqrt(discriminantNum))/(2*a); //Value of x1 when discriminant positive or zero
        double x2 = (-b - Math.sqrt(discriminantNum))/(2*a); //Value of x2 when discriminant positive

        if (discriminantNum > 0 ) {
            System.out.printf("x1 = %.2f\n",x1);
            System.out.printf("x2 = %.2f\n",x2);            
        }
        else if (discriminantNum == 0) {
            System.out.println("The Quadratic Equation has one root because the Discriminant is equaled zero.");
            System.out.printf("x1 = %.2f\n",x1);
        }
        else {
            System.out.println("The Quadratic Equation has no roots because the Discriminant is negative.");
        }
    }
}