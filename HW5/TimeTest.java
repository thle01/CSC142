

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TimeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TimeTest
{
    @Test
    public void timeFullConstructorTest()
    {
        Time time1 = new Time(2, 53);
        assertEquals(2, time1.getHour());
        assertEquals(53, time1.getMinute());
        time1.setHour(3);
        time1.setMinute(13);
    }
}

