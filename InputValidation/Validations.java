
/**
 * Validations class that have 3 method validateZip, validateSSN, validatePassWord that all returns boolean (true or false)
 *
 * @author Hien Le - hien.t.le3@
 * @version 10/16/19
 */
public class Validations
{
    /**
     * validateZip method - validate that a String represents a valid zip code. 
     *  A valid zip code is made up of 5 digits.
     * @param  s  input zip string to be validated
     * @return boolean (true or false)
     */
    public static boolean validateZip(String s)
    {
        String regex = "\\d{5}"; 
        //5 digits check
        return s.matches(regex);
    }
    
    /**
     * validateSSN method - validate that a String represents a 9-digit SSN.
     * A valid SSN follows the pattern XXX-XX-XXXX, including the dashes.
     * @param  s  input SSN string to be validated 
     * @return boolean (true or false)
     */
    public static boolean validateSSN(String s)
    {
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        //3 digits - 2 digits - 4 digits
        return s.matches(regex);
    }
    
    /**
     * validatePassWord method - validate that a String represents  
     * 8 symbols, including letters (upper and lower case), numbers, and special symbols like #$&_. 
     * @param  s  input a string to be validated
     * @return boolean (true or false)
     */
    public static boolean validatePassWord(String s)
    {
        String regex = "((?=.*[a-z])(?=.*[A-Z])(?=.*d)(?=.*[@#$%]).{8,8})";
        /*
        (?=.*[a-z])     : This matches the presence of at least one lowercase letter.
        ((?=.*[A-Z])    : This matches the presence of at least one uppercase letter.
        (?=.*d)         : This matches the presence of at least one digit i.e. 0-9.
        (?=.*[@#$%])    : This matches the presence of at least one special character.
        {8,8}           : This limits the length of password from minimum 8 letters to maximum 8 letters.
         */
        return s.matches(regex);
    }

}
    
