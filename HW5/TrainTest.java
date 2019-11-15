import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TrainTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TrainTest
{
        

    @Test
    public void trainFullConstructorTest()
    {
        Train train1 = new Train("Night Express", new Time(5,6), new Time(9,3), 650);
        Time newArrival = new Time(9,3); 
        //assertEquals(newArrival, train1.getArrival());
        Time newDeparture = new Time(5,6);
        //assertEquals(newDeparture, train1.getDeparture());
        assertEquals(650, train1.getDistance());
        assertEquals(131, train1.averageSpeed());
        train1.setArrival(new Time(3,6));
        train1.setDeparture(new Time(6,9));
        train1.setDistance(269);
    }

    
}




