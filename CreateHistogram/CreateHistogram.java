/** Program to display histogram of Presidental Elections registered and voters
* @author Hien Le (Hien.T.Le3@Seattlecolleges.edu)
* @version Sept 30, 2019 - CSC 142 - Homework Week 1
*/


class CreateHistogram {
    public static final String HEADER = "Presidential Elections";
    public static final int TERMINAL_WIDTH = 65;
    public static final char CHAR_TOTAL = 'T';
    public static final char CHAR_REGISTER = 'R';
    public static final char CHAR_VOTER = 'V';
    public static final int SCALE = 100000;
    public static final int STEP = 1000000;
    public static final int MAX_AXIS_VALUE = 6000000;

    public static void main(String[] args) {
        printHeader();
        
        createBar(2000,4368000,CHAR_TOTAL);
        createBar(3335714,CHAR_REGISTER);
        calPercent(3335714,4368000);
        createBar(2517028,CHAR_VOTER);
	calPercent(2517028,4368000);
        emptyRow();

        createBar(2004,4646000,CHAR_TOTAL);
        createBar(3508208,CHAR_REGISTER);
	calPercent(3508208,4646000);
        createBar(2884783,CHAR_VOTER);
	calPercent(2884783,4646000);
        emptyRow();
        
        createBar(2008,5010844,CHAR_TOTAL);
        createBar(3630118,CHAR_REGISTER);
	calPercent(3630118,5010844);
        createBar(3071587,CHAR_VOTER);
	calPercent(3071587,5010844);
        emptyRow();

        createBar(2012,5221125,CHAR_TOTAL);
        createBar(3904959,CHAR_REGISTER);
	calPercent(3904959,5221125);
        createBar(3172930,CHAR_VOTER);
	calPercent(3172930,5221125);
        emptyRow();

        createBar(2016,5557921,CHAR_TOTAL);
        createBar(4270270,CHAR_REGISTER);
	calPercent(4270270,5557921);
        createBar(3363440,CHAR_VOTER);
	calPercent(3363440,5557921);      
        createAxis();
        
    }

    /** Method printHeader create the histogram chart's header using the value from constant
     */
    public static void printHeader() {
        int spaces = (TERMINAL_WIDTH-HEADER.length())/2;
        for (int i = 0; i <= spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(HEADER);
    }

    /** Method createBar create the histogram chart using data from input
     * @param year an integer specifying the bar title
     * @param value an integer specifying the bar value
     * @param ch the character that will be used to create the graph
     */
    public static void createBar(int year, int value, char ch) {
        System.out.print(year);
        System.out.print("  |");
        int countOfCharacters = value/SCALE;
        for (int i = 0; i<= countOfCharacters; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    /** Method createBar create the histogram chart using data from input
     * @param value an integer specifying the bar value
     * @param ch the character that will be used to create the graph
     */
    public static void createBar(int value, char ch) {
        System.out.print("      |");
        int countOfCharacters = value/SCALE;
        for (int i = 0; i<= countOfCharacters; i++) {
            System.out.print(ch);
        }
        System.out.print("\t");
    }

    /** Method to createAxis 
     * Method print 2 lines. One for the tick mark. One for the number in the X axis (from 0 to 6MM)
     */
    public static void createAxis() {
        System.out.print("      |");
        int numberOfStep = MAX_AXIS_VALUE/STEP;
        int numberOfAxisSign = STEP/SCALE-2;
        for (int i=0; i< numberOfStep;i++) {
            for (int j=0; j<=numberOfAxisSign; j++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();
        System.out.print("      0      ");
        for (int i=1; i<= numberOfStep;i++) {
            System.out.print(i*STEP+"   ");
        }
    }

    
    /** Method emptyRow. Method print emtpy row
     * 
     */
    public static void emptyRow() {
        System.out.println("      |");
    }

    /** Method to calPercen. This method print percentage from 2 inputs with formatted 2 decimals and a percentage sign
     * @param par1 double numerator
     * @param par2 double denominator
     */
    public static void calPercent(double par1, double par2) {
    	double percent = par1 * 100 / par2;
    	String format = "%.2f%%%n";
        System.out.printf(format, percent);
    }
   
}