
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        MyDate d1 = new MyDate();
        System.out.println(d1);
        MyDate d2 = new MyDate(1,2,2039);
        System.out.println(d2);
        System.out.println(d2.daysInMonth());
        d2.getNextDay();
        System.out.println(d2.getDay());
        MyDate today = new MyDate(10,22,2019);
        MyDate final_date = new MyDate(12,10,2019);
        System.out.println(today.daysBetween(final_date));
    }

}
