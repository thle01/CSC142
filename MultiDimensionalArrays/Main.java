import java.util.Arrays;
/**
 * Multi Dimensional array.
 *
 * @author Hien Le
 * @version 10/11/2019
 */
public class Main
{
    public static void main(String[] args) {
        array();
    }
    
    public static void array() {
        int[][][] a = new int[5][2][3];
        System.out.println(Arrays.deepToString(a));
    }
}
