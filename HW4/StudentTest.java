

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    @Test
    public void fullConstructorTest()
    {
        Student student2 = new Student("Henry", "Le", "804352582", false, true, false);
        assertEquals(550.0, student2.getBalance(), 0.1);
        assertEquals(false, student2.getCSC110());
        assertEquals(true, student2.getCSC142());
        assertEquals(false, student2.getCSC143());
        assertEquals("Henry", student2.getFirstName());
        assertEquals("804352582", student2.getID());
        assertEquals("Le", student2.getLastName());
        student2.setCSC110(false);
        student2.setCSC142(true);
        student2.setCSC143(false);
        student2.setFirstName("Henry1");
        student2.setID("123456");
        student2.setLastName("Nf");
    }
    
    @Test
    public void partialConstructorTest()
    {
        Student student2 = new Student("Henry", "Le", "804352582");
        assertEquals(550.0, student2.getBalance(), 0.1);
        student2.setCSC110(false);
        student2.setCSC142(true);
        student2.setCSC143(false);
        assertEquals(false, student2.getCSC110());
        assertEquals(true, student2.getCSC142());
        assertEquals(false, student2.getCSC143());
        assertEquals("Henry", student2.getFirstName());
        assertEquals("804352582", student2.getID());
        assertEquals("Le", student2.getLastName());        
        student2.setFirstName("Henry1");
        student2.setID("123456");
        student2.setLastName("Nf");
    }
}

