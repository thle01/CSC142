
/**
 * Class Student will create a new Student object
 *
 * @author Hien Le hien.t.le3@
 * @version 10/22/2019
 */
public class Student
{
    private String firstName, lastName, id;
    private boolean csc110, csc142,csc143;
    private static final int CREDIT = 5;
    private static final double CREDIT_COST = 110.0;
    
    /*
     * 
     * 
     * Constructors
     * 
     * 
     */
    
    /**
     * Constructor Student will create a new object student with 6 parameters
     *
     * @param  firstName  first name of the student
     * @param  lastName  last name of the student
     * @param  id  student id
     * @param  csc110  the class that student take or not
     * @param  csc142  the class that student take or not
     * @param  csc143  the class that student take or not
     */
    public Student(String firstName, String lastName, String id, boolean csc110, boolean csc142, boolean csc143) 
    {
        setFirstName(firstName);
        setLastName(lastName);
        setID(id);
        setCSC110(csc110);
        setCSC142(csc142);
        setCSC143(csc143);
      
    }
    
    /**
     * Constructor Student will create a new object with 3 parameters
     *
     * @param  firstName  first name of the student
     * @param  lastName  last name of the student
     * @param  id  student id
     */
    public Student(String firstName, String lastName, String id) 
    {
        setFirstName(firstName);
        setLastName(lastName);
        setID(id);
    }
    
    /*
     * 
     * 
     * Accessor
     * 
     * 
     */
    
    /**
     * Accessor getFirstname will return the first name of the student
     *
     * @return  first name of the student
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Accessor getLastName will return the last name of the student
     *
     * @return    last name of the student
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Accessor getID will return the student ID
     *
     * @return    the Student ID
     */
    public String getID()
    {
        return id;
    }

    /**
     * Accessor getCSC110 will return the status of the student in the CSC110 class
     *
     * @return    boolean value. true mean the student is registered in the class
     */
    public boolean getCSC110()
    {
        return csc110;
    }

    /**
     * Accessor getCSC142 will return the status of the student in the CSC142 class
     *
     * @return    boolean value. true mean the student is registered in the class
     */
    public boolean getCSC142()
    {
        return csc142;
    }

    /**
     * Accessor getCSC143 will return the status of the student in the CSC143 class
     *
     * @return    boolean value. true mean the student is registered in the class
     */
    public boolean getCSC143()
    {
        return csc143;
    }

 
    /** 
     * Accessor getBalance will return the tuition balance of the student
     *
     * @return    tuition balance of the student
     */
    public double getBalance()
    {
        return CREDIT * CREDIT_COST;
    }

    

    /*
     * 
     * 
     * Mutators
     * 
     * 
     */
    
    /**
     * Mutators method setFirstName will check for non empty string only
     *
     * @param  firstName  First name of the student
     */
    public void setFirstName (String firstName)
    {
        if (firstName.isBlank())
            throw new IllegalArgumentException("The input you entered is blank");
        else if (firstName.matches("\\d"))
            throw new IllegalArgumentException("The input you entered contain a number");
        else if (firstName.matches("\\W"))
            throw new IllegalArgumentException("The input you entered contain a non-word characters");
        else 
            this.firstName = firstName;
    }

    /**
     * Mutators method setLastName will check for non empty string only
     *
     * @param  lastName last Name of the student
     */
    public void setLastName (String lastName)
    {
        if (lastName.isBlank())
            throw new IllegalArgumentException("The input you entered is blank");
        else if (lastName.matches("\\d"))
            throw new IllegalArgumentException("The input you entered contain a number");
        else if (lastName.matches("\\W"))
            throw new IllegalArgumentException("The input you entered contain a non-word characters");
        else 
            this.lastName = lastName;
    }

    /**
     * Mutators method setID will check for the student ID string
     *
     * @param  id Student ID number with the dashes in between
     */
    public void setID (String id)
    {
        if (id.isBlank())
            throw new IllegalArgumentException("The input you entered is blank");
        else 
            this.id = id;
    }

    /**
     * Mutators method setCSC110 will set the value of the student in the class CSC110
     *
     * @param  csc110 the boolean value of status of the student in the class
     */
    public void setCSC110 (boolean csc110)
    {
        this.csc110 = csc110;
        if (csc110) {
            csc142 = false;
            csc143 = false;
        }
    }

    /**
     * Mutators method setCSC142 will set the value of the student in the class CSC142
     *
     * @param  csc142 the boolean value of status of the student in the class
     */
    public void setCSC142(boolean csc142)
    {
        this.csc142 = csc142;
        if (csc142) {
            csc110 = false;
            csc143 = false;
        }
    }

    /**
     * Mutators method setCSC143 will set the value of the student in the class CSS143
     *
     * @param  csc143 the boolean value of status of the student in the class
     */
    public void setCSC143 (boolean csc143)
    {
        this.csc143 = csc143;
        if (csc143) {
            csc110 = false;
            csc142 = false;
        }
    }

    
    /*
     * 
     *  toString
     * 
     */
    public String toString()
    {
        String c = "";
        if(getCSC110())
            c= "csc110";
        else if(getCSC142())
            c="csc142";
        else if(getCSC143())
            c="csc143";
        return 
        "The name:" + getFirstName() +" " + getLastName() + "\n" 
        + "ID: " + getID() + "\n" 
        + "The chosen class: " + c +"\n"
        +"Credits: " + CREDIT + "\n"
        +"Credit Price: " + CREDIT_COST + "\n"
        +"The balance: "+ getBalance()        
        ;
    }
}
