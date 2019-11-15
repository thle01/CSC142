/** class to model a row * col matrix of doubles <br>
  * 
  * @author CSC 142 Fall 2018
  */

public class Matrix {
    
    private int row;
    private int col;
    private double[][] matrix;
    
    // declare the instance variable that will hold the 2-dim array
    
    
    /**Instantiate a ROW x COL matrix, empty
      */
    public Matrix() {
        double[][] matrix = new double[row][col];
    }
        
    /** set the value of a particular element in the matrix
      * @param row the row of the element. 0 <= row < Matrix.ROW
      * @param col the column of the element.   0 <= col < Matrix.COL
      * @param value the value to be stored
      * @throws ArrayIndexOutOfBoundsException for invalid row or column
      */
    public void setValue(int row, int col, double value) {
        // Why don't we have to test row/col for validity?
        if (row < 0 || row >= this.row) 
            throw new ArrayIndexOutOfBoundsException("row is invalid");
        this.row = row;
        if (col < 0 || col >= this.col) 
            throw new ArrayIndexOutOfBoundsException("column is invalid");    
        this.col = col;
        matrix[row][col] = value;
    }
    
    /** returns the value of a particular element in the matrix
      * @param row the row of the element. 0 <= row < Matrix.ROW
      * @param col the column of the element.   0 <= col < Matrix.COL
      * @throws ArrayIndexOutOfBoundsException for invalid row or column
      */
    public double getValue(int row, int col) {
        return matrix[row][col];
    }
       
    /** swap 2 rows of this matrix
      * @param r1 one of the rows to swap.  0 <= r1 < Matrix.ROW
      * @param r2 the other row to swap.   0 <= r2 < Matrix.ROW
      * @throws ArrayIndexOutOfBoundsException for invalid row or column
      */
    public void swapRows(int r1, int r2) {
        double[] temp = matrix[r1];
        matrix[r1] = matrix[r2];
        matrix[r2] = temp;
    }
    
    /** multiply one row by a non-zero constant
      * @param multiple the non-zero constant
      * @param row the row to change
      * @throws IllegalArgumentException if multiple is 0
      * @throws ArrayIndexOutOfBoundsException for invalid row
      */
    public void multiplyRow(double multiple, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] *= multiple;
        }
    }
    
    /** add row r1 into row r2. Equivalent to r2 += r1 
     * @param r1 the row to add  0 <= r1 < Matrix.ROW
     * @param r2 the row to add into.  0 <= r2 < Matrix.ROW.  This row will change.
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public void addRows (int r2, int r1) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row1][i] += matrix[row2][i];
        }
    }
    
    /**
     * set new row in the matrix
     * @param row the new row to insert
     * @param rIdx the index of this new row  0 <= rIdx < Matrix.ROW
     * @return the old row
     * @throws IllegalArgument exception if row is not the correct length of Matrix.COL
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public double[] replace(double[] row, int rIdx) {
        matrix[rIdx] = row;
    
    }
    
    /**
     * Add 2 Matrices together and return a new Matrix
     * @param m the 2nd Matrix
     * @return the matrix sum of this + m
     */
    
    public Matrix sum(Matrix m){
        
    }
        
    /** Return this matrix as a String of 3 rows of numbers in 4 columns
      */
    public String toString() {

    }
}  
