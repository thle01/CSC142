
/**
 * Class Train
 *
 * @author Hien Le
 * @version 10/29/2019
 */
public class Train
{

    private String name;
    private int distance;
    private Time departure, arrival; 

    //Constructor
    /**
     * Constructor for objects of class Train
     * @param name      Name of the train
     * @param departure Departure time of the train
     * @param arrival   Arrival time of the train
     * @param distance  Distance the train traveled
     */
    public Train(String name, Time departure, Time arrival, int distance)
    {
        if (!(name.matches("[a-zA-Z0-9 -]{1,50}")))
            throw new IllegalArgumentException("Name input is wrong. Name must be a string with a length of 1 to 50 characters. It can contain letters of the English alphabet, spaces, numbers, and dashes. Lowercase and uppercase letters in the names of trains vary");
        this.name = name; 
        setDeparture(departure);
        setArrival(arrival);
        setDistance(distance);

    }

    //Mutators
    /**
     * setDepature will set the departure time of the train
     *
     * @param  departure The departure time of the train
     */
    public void setDeparture (Time departure)
    {
        if (departure == null)
            throw new IllegalArgumentException("Departure time is empty");
        this.departure = departure;
    }

    /**
     * setArrival will set the arrival time of the train
     *
     * @param  arrival The arrival time of the train
     */
    public void setArrival(Time arrival)
    {
        if (arrival == null)
            throw new IllegalArgumentException("Arrival time is empty");
        this.arrival = arrival;
    }

    /**
     * setDistance will set the distance the train will travel
     *
     * @param  distance The distance the train will travel
     */
    public void setDistance(int distance)
    {
        if (distance < 0)
            throw new IllegalArgumentException("Distance must be bigger than 0");
        this.distance = distance;
    }

    //Accessor
    /**
     * getDeparture will return the departure time of the train
     *
     * @return    The departure time of the train
     */
    public Time getDeparture()
    {
        return departure;
    }

    /**
     * getArrival will return the arrival time of the train
     *
     * @return    The arrival time of the train
     */
    public Time getArrival()
    {
        return arrival;
    }

    /**
     * getDistance will return the distace that the train traveled
     *
     * @return    The distance the train traveled
     */
    public int getDistance()
    {
        return distance;
    }

    //Other method
    /**
     * averageSpeed method will return the speed 
     *
     * @return  speed 
     */
    public int averageSpeed ()
    {
        double time = travelTime().getHour() + (double)travelTime().getMinute()/60;
        double speed = distance/time;
        return (int)speed;
    }

    /**
     * travelTime method will return the time traveled of the train
     *
     * @return    the sum of x and y
     */
    public Time travelTime()
    {
        return getDeparture().timeBetween(getArrival());
    }

    //toString
    public String toString() {
        return 
        name +"\n" 
        +"Departure "+ getDeparture()   +"\n"
        +"Arrival " + getArrival()+"\n"
        +"Travel Time "+ travelTime() +"\n"
        +"Average speed "+ averageSpeed() + " km\\h";
    }

}
