import java.util.Scanner;
/**
 * ValidateApp will tell you if you have a valid zip code, SSN, password.
 *
 * @author Hien Le - hien.t.le3@
 * @version 10/16/19
 */
public class ValidateApp
{
        
    public static void main(String[] args) {
        runApp();
    }
    
    /**
     * runApp method - this will kick off the program and do what the users ask for 
     *
     */
    public static void runApp()
    {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Welcome to Henry's app. Please follow the instructions and enjoy");
        String menu = "The Menu\n1. Validate zip code\n2. Validate SSN\n3. Validate password\n4. Instructions \n0. Quit";
        int n = -1;
        do {
            System.out.println(menu);
            n = getInt(sc);
            if (n == 0) {
                System.out.println("Goodbye");
            }            
            else if (n == 1) {
                check(sc, "Zip Code");                
            }
            else if (n == 2) {
                check(sc, "SSN");
            }
            else if (n == 3) {
                check(sc, "Password");
            }
            else if (n == 4) {
                System.out.println(menu);
            }
            else {
                System.out.println("Please input a valid number between 0 and 4 (0,1,2,3,4)");
            }
        }
        while (n != 0);        
        
    }
    
    /**
     * getInt method - check if the input is integer
     *
     * @param  sc Scanner
     * @return int value
     */
    public static int getInt(Scanner sc)
    {
        
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Not an integer; try again.");
                    
        }
        return sc.nextInt();
    }
    
    /**
     * check method - check the String based on the type and return the result
     * @param  sc Scanner
     * @param s the string that will be validated
     */
    public static void check(Scanner sc,String s)
    {
        System.out.println("Please enter a "+ s + " to be validated");
        boolean result = false;
        String userInput = sc.next();
        String errorMessage = "";
        
        
        if (s == "Zip Code") {
            result = Validations.validateZip(userInput);
            errorMessage = "A valid zip code is made up of 5 digits ";
        }
        else if (s == "SSN") {
            result = Validations.validateSSN(userInput);
            errorMessage = "A valid SSN follows the pattern XXX-XX-XXXX, including the dashes";
        }
        else if (s == "Password") {
            result = Validations.validatePassWord(userInput);
            errorMessage = "A valid password have 8 symbols, including letters (upper and lower case), numbers, and special symbols like #$&_.";
        }
           
        if (result == true) {
            System.out.println("Input is valid. The " + s + " you entered is " + userInput );            
        }
        else {
            System.out.println("The " + s + " you entered is Not Valid.");
            System.out.println(errorMessage);
        }
    }

    
        
}
