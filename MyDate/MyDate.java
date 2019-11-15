
/**
 * Write a description of class MyDate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyDate
{
    private int day,month,year;
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public MyDate(int month, int day, int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public MyDate()
    {
        this(1,1,2000);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public MyDate(MyDate other)
    {
        this(other.month, other.day, other.year);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setDay(int day)
    {
        if (day <= 0 || day >= 32)
           throw new IllegalArgumentException("Wrong day");
        this.day = day;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setMonth(int month)
    {
        if (month <= 0 || month >= 13)
           throw new IllegalArgumentException("Wrong month");
        this.month= month;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setYear(int year)
    {
        if (year <= 0)
           throw new IllegalArgumentException("Wrong year");
        this.year = year;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getDay()
    {
        return this.day;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getMonth()
    {
        return this.month;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean isLeapYear()
    {
        return (year % 4 == 0 || (year % 100 != 0 && year % 4 ==0));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int daysInMonth()
    {
        int n = 31;
        if (this.month == 2) {
            n = 28;
            if (isLeapYear())
                n = 29;
        }
        else if (this.month == 4 || this.month == 6 ||this.month == 9 ||this.month == 11) {
            n = 30;
        
        }
        return n;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getDaysInYear(int year)
    {
        int n = 365;
        if (isLeapYear())
            n = 366;
        return n;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getNextDay()
    {
        this.day++;
        if (this.day > this.daysInMonth()) {
            this.month++;
            this.day = 1;
            if (this.month > 12) {
                this.year++;
                this.month = 1;
            }
        
        }
    }
    
    /**
     * Iterates an instance of the MyDate object to the next day after other object
     */
    public void getNextDay(MyDate other)
    {
        other.day++;
        if (other.day > other.daysInMonth()) {
            other.month++;
            other.day = 1;
            if (other.month > 12) {
                other.year++;
                other.month = 1;
            }
        
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int daysBetween(MyDate other)
    {
        MyDate temp = new MyDate(this);
        int days = 0;
        
        while (temp.day != other.day || temp.month != other.month || temp.year != other.year) {
            temp.getNextDay(temp);
            days++;
        }
        return days;
    }

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return month + "/"+ day + "/"+ year;
    }

    
    public static void test () {
        //test an empty construstor
        MyDate d = new MyDate();
        if (d.getDay() != 1) System.out.println("Day must be equal to 1 but the result is " + d.getDay());
        if (d.getMonth() != 1) System.out.println("Month must be equal to 1 but the result is " + d.getMonth());
        if (d.getYear() != 2000) System.out.println("Year must be equal to 2000 but the result is " + d.getYear());
    }
}
