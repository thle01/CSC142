
/**
 * Display the desired output
 *
 * @author Hien Le
 * @version 09/24/2019
 */
public class Main
{
    public static void main(String[] args) {
        String name = "Hien Le";
        greeting(name);
        drawFigure();
        String name1 = "Betty";
        int age = 17;
        String height = "5'6\"";
        showData(name1,age,height);
    }
    
    
   
    public static void greeting(String str) {
        System.out.println("Welcome " +str+"\nThis is my first experiment.\n Hooray!");
    }
     
    public static void drawFigure() {
        System.out.println("   -");
        System.out.println("  / \\");
        System.out.println(" /   \\");
        System.out.println("|     |");
        System.out.println(" \\   /");
        System.out.println("  \\ /");
        System.out.println("    -");
    }
    
    public static void showData(String par1,int par2, String par3) {
        System.out.println("name\tage\theight");
        System.out.println(par1 +" \t" + par2 + " \t" + par3);
    }
}
