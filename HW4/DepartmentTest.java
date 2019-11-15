

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DepartmentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DepartmentTest
{
    
    @Test
    public void fullConstructortTst()
    {
        Department departme1 = new Department(22, 22, 22, 9338);
        assertEquals(36300.0, departme1.getTotalBalance(), 0.1);
        assertEquals(22, departme1.getTotalCSC110());
        assertEquals(22, departme1.getTotalCSC142());
        assertEquals(22, departme1.getTotalCSC143());
        assertEquals(1, departme1.getTotalGr110());
        assertEquals(1, departme1.getTotalGr142());
        assertEquals(1, departme1.getTotalGr143());
        assertEquals(66, departme1.getTotalStudents());
    }

   

    @Test
    public void BlankConstructorTest()
    {
        Department departme1 = new Department();
        departme1.addStudent(new Student("Name","LastName","3333",true,false,false));
        assertEquals(550.0, departme1.getTotalBalance(), 0.1);
        assertEquals(1, departme1.getTotalCSC110());
        assertEquals(0, departme1.getTotalCSC142());
        assertEquals(0, departme1.getTotalCSC143());
        assertEquals(1, departme1.getTotalGr110());
        assertEquals(0, departme1.getTotalGr142());
        assertEquals(0, departme1.getTotalGr143());
        assertEquals(1, departme1.getTotalStudents());
    }
}





