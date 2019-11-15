import java.util.Scanner;
/**
 * Class main
 *
 * @author Hien Le
 * @version 11/5/2019
 */
public class Main
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input the distance between 2 cities");
        int distance = console.nextInt();

        System.out.println("Please input the number of trains in the everyday schedule; between 1 and 100");
        int numberOfTrain = console.nextInt();

        console.nextLine();
        System.out.println("Please input a train name");
        String name = console.nextLine();

        System.out.println("Please input departure and arrival time");
        Time departure = new Time(console.nextInt(),console.nextInt());
        Time arrival = new Time(console.nextInt(),console.nextInt());

        Train train1 = new Train(name, departure, arrival,distance);
        System.out.println(train1);
    }
}

//To-do
//1. Complete documentation [DONE]
//2. Name check condition [DONE]
//3. Add scanner to read from user input [DONE]
//4. Check with previous HW to be sure
//5. Add tests
