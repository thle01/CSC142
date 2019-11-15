
/**
 * Class Time
 *
 * @author Hien Le
 * @version 10/29/2019
 */
public class Time
{
    private int hour, minute;

    //Constructor
    /**
     * Constructor Time will return Time in HHMM format
     *
     * @param  hour   hour in 24 hour format
     * @param  minute minute
     */
    public Time(int hour, int minute)
    {
        setHour(hour);
        setMinute(minute);
    }

    //Mutators
    /**
     * setHour method will change the variable hour to the input hour in 24 hour format
     *
     * @param  hour require an int input from 0 to 24
     */
    public void setHour(int hour)
    {
        if (hour < 0 || hour > 24)
            throw new IllegalArgumentException("Wrong hour");
        this.hour = hour;
    }

    /**
     * setMinute method will change the variable minute to the input minute
     *
     * @param  minute require an int input from 0 to 60
     */
    public void setMinute(int minute)
    {
        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Wrong minute");
        this.minute = minute;
    }

    //Accessors
    /**
     * getHour will return hour
     *
     * @return    hour
     */
    public int getHour()
    {
        return hour;
    }

    /**
     * getMinute will return minute
     *
     * @return    minute
     */
    public int getMinute()
    {
        return minute;
    }

    //Other method
    /**
     * timeBetween method measure the time in between the 2 time object
     *
     * @param other the second time object to compare
     * @return Time object
     */
    public Time timeBetween(Time other)
    {
        int h = other.getHour() - hour;
        if (h < 0) {
            h = 24 - hour + other.getHour();
        }
        int m = other.getMinute() - minute;
        if (m < 0) {
            m = 60 - minute + other.getMinute();
            h--;
        }
        Time temp = new Time(h, m);        
        return temp;
    }

    /**
     * minBetween method measure the minute in between the 2 time object
     *
     * @param  other The Time obeject to compare
     * @return  minute in between
     */
    public int minBetween(Time other)
    {
        Time temp = new Time(hour,minute);
        Time diff = temp.timeBetween(other);
        return diff.getHour() * 60 + diff.getMinute();
    }

    /**
     * zeroTime method add 0 to an int(hour/minute) that are less than 0
     *
     * @param  n input number that are less than 0 for change
     * @return   input int with zero in front
     */
    public String zeroTime(int n)
    {
        String s = "";
        if (n >= 0 && n <= 9) 
            s = "0"+n;
        else 
            s = ""+n;
        return s;
    }

    //toString
    public String toString()
    {
        return zeroTime(hour)+":"+zeroTime(minute);
    }

}
