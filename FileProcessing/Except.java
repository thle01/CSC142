import javax.swing.*;

public class Except
{
    public static void main(String[] args)
    {
        int n1=1000;
        String n = JOptionPane.showInputDialog("Enter the number: ");
        try
        {
            int n2=Integer.parseInt(n);
            System.out.println("The result is: " + n1/n2);
            JOptionPane.showMessageDialog(null,"Given two numbers "+n1+" и "+n2+"\nThe result is: "+n1/n2,"Message", JOptionPane.INFORMATION_MESSAGE );
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero "+e.toString());
        }
        catch(Exception e)
        {
            System.out.println("Error "+ e.toString());
        }
    }
}
