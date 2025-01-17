
/**
 * Class Departmemt will create a new Department object.
 *
 * @author Hien Le hien.t.le3@
 * @version 10/22/2019
 */
public class Department
{
    private int totalStud110, totalStud142, totalStud143;
    private double totalBalance;
    private static final double GROUP_SIZE = 28.0;
    private static final int CREDIT = 5;
    private static final int CREDIT_COST = 110;
    
    /*
     * 
     * 
     * Constructors
     * 
     * 
     */ 
    
    /**
     * Constructor Department will create a new department object
     *
     * @param  totalStud110 the total number of student in class CSC110
     * @param  totalStud142 the total number of student in class CSC142
     * @param  totalStud143 the total number of student in class CSC143
     * @param  totalBalance the total number of tuition balance in the entire CSC department
     */
    public Department (int totalStud110, int totalStud142, int totalStud143, double totalBalance)
    {
        this.totalStud110 = totalStud110;
        this.totalStud142 = totalStud142;
        this.totalStud143 = totalStud143;
        this.totalBalance = totalBalance;
    }
    
    /**
     * Constructor Department blank will create a blank Department with 0 everything
     *
     */
    public Department ()
    {
        this(0,0,0,0);
    }
    /*
     * 
     * 
     * Accessor
     * 
     * 
     */
    
    /**
     * Accessor getTotalCSC110 will return the total number of student in the class CSC 110
     *
     * @return the number of students in CSC 110
     */
    public int getTotalCSC110()
    {
        return totalStud110;
    }

    /**
     * Accessor getTotalCSC142 will return the total number of student in the class CSC 142
     * 
     * @return the number of students in CSC 142
     */
    public int getTotalCSC142()
    {
        return totalStud142;
    }
    
    /**
     * Accessor getTotalCSC143 will return the total number of student in the class CSC 143
     * 
     * @return the number of students in CSC 143
     */
    public int getTotalCSC143()
    {
        return totalStud143;
    }

    /**
     * Accessor getTotalStudents will return the total number of student in all 3 classes CSC 110, 142 and 143
     *
     * @return total number of students in the entire CSC department
     */
    public int getTotalStudents ()
    {
        return totalStud110 + totalStud142 + totalStud143;
    }

    /**
     * Accessor getTotalBalance will return the total tuition balance in the entire CSC department
     *
     * @return   the total tuition balance in the entire CSC department
     */
    public double getTotalBalance ()
    {
        return getTotalStudents () * CREDIT * CREDIT_COST;
    }

    /**
     * Accessor getTotalGr110  will return the possible number of group in the class CSC 110 based on group size of 28
     *
     * @return    the number of group
     */
    public int getTotalGr110 ()
    {
        return (int)Math.ceil(totalStud110/GROUP_SIZE);
    }

    /**
     * Accessor getTotalGr142 will return the possible number of group in the class CSC 142 based on group size of 28
     *
     * @return    the number of group
     */
    public int getTotalGr142 ()
    {
        return (int)Math.ceil(totalStud142/GROUP_SIZE);
    }

    /**
     * Accessor getTotalGr143 will return the possible number of group in the class CSC 143 based on group size of 28
     *
     * @return    the number of group
     */
    public int getTotalGr143 ()
    {
        return (int)Math.ceil(totalStud143/GROUP_SIZE);
    }

    

    /**
     * addStudent method
     *
     * @param  newStudent object created by Student class
     */
    public void addStudent (Student newStudent)
    {
        if (newStudent.getCSC110())
            totalStud110++;
        else if (newStudent.getCSC142())
            totalStud142++;
        else if (newStudent.getCSC143())
            totalStud143++;
    }
    
    /*
     * 
     * ToString
     * 
     */
    public String toString ()
    {
        return 
        "Total students in CSC110: " + getTotalCSC110() + " in "+ getTotalGr110 () +" groups \n"
        +"Total students in CSC142: " + getTotalCSC142() + " in "+ getTotalGr142() +" groups \n"
        +"Total students in CSC143: " + getTotalCSC143() + " in "+ getTotalGr143() +" groups \n"
        +"Total students of the department: " + getTotalStudents () + "\n"
        +"Total Balance: $" + getTotalBalance ()
        ;
    }
    
}
