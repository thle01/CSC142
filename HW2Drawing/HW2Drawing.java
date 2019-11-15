import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

/** Program to display 3 images: (1) Paraboic curves (2) Diamond with chess board in the middle (3) Parabolic with different orientation.
* @author Hien Le (Hien.T.Le3@Seattlecolleges.edu)
* @version October 9, 2019 - CSC 142 - Homework Week 2
*/

class HW2Drawing {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int LINES = 50;
    public static final int WIDTH1 = 400;
    public static final int HEIGHT1 = 400;
    public static final int LINES1 = 40;

    public static void main(String[] args) {
       drawPart1(WIDTH,HEIGHT);
       drawPart2(WIDTH1,HEIGHT1);
       drawExtraCredit(WIDTH,HEIGHT);
    }   

    /**
     * DrawPart1 method that will draw a Parabolic figure. Color is generated randomly
     * @param width This is the width of the canvas that we will be drawing on
     * @param height This is the height of the canvas that we will be drawing on
     */
    public static void drawPart1(int width, int height)
    {
        DrawingPanel panel = new DrawingPanel(width,height);
        Graphics g = panel.getGraphics();      
        int spaces = width/2/LINES;

        Color randomColor1 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor2 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor3 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor4 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));

        for (int i = 0; i <= LINES; i++) {
            g.setColor(randomColor1);            
            g.drawLine(i*spaces,height/2,width/2,height/2-i*spaces); //draw Q1
            g.setColor(randomColor2);
            g.drawLine(width/2,height/2-i*spaces,width-i*spaces,height/2); //draw Q2
            g.setColor(randomColor3);
            g.drawLine(width-i*spaces,height/2,width/2,height/2+i*spaces); //draw Q3
            g.setColor(randomColor4);
            g.drawLine(width/2,height/2+i*spaces,i*spaces,height/2); //draw Q4
        }
    }

    /**
     * drawPart2 method that will draw a diamond in the form of parabolic with the chess board inside
     *
     * @param width This is the width of the canvas that we will be drawing on
     * @param height This is the height of the canvas that we will be drawing on
     */
    public static void drawPart2(int width, int height)
    {
        DrawingPanel panel = new DrawingPanel(width,height);
        Graphics g = panel.getGraphics();  
        drawDiamond(g, WIDTH1,HEIGHT1);
        drawChessBoard(g, WIDTH1,HEIGHT1);
    }

    /**
     * drawDiamond method that will draw a diamond using the parabolic curves. Color is generated randomly
     *
     * @param g initiate the canvas to draw on
     * @param width This is the width of the canvas that we will be drawing on
     * @param height This is the height of the canvas that we will be drawing on
     * 
     */
    public static void drawDiamond (Graphics g, int width, int height)
    {
        int spaces = width/LINES1;
        Color randomColor1 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor2 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor3 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor4 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));

        for (int i = 0; i <= LINES1; i++) {
            g.setColor(randomColor1);            
            g.drawLine(i*spaces,width-height,width-height,height-i*spaces); //draw Q1            
            g.setColor(randomColor2);
            g.drawLine(width-height,height-i*spaces,width-i*spaces,height); //draw Q2
            g.setColor(randomColor3);
            g.drawLine(width-i*spaces,height,width,i*spaces); //draw Q3
            g.setColor(randomColor4);
            g.drawLine(width,i*spaces,i*spaces,width-height); //draw Q4
        }
    }

    /**
     * drawChessBoard method
     *
     * @param g initiate the canvas to draw on
     * @param width This is the width of the canvas that we will be drawing on
     * @param height This is the height of the canvas that we will be drawing on
     */
    public static void drawChessBoard(Graphics g,int width, int height) 
    {
        int chessBoardSize = 10;
        int numCenter = width/4;
        int x1, y1, chessBoardWidth, chessBoardHeight;
        chessBoardWidth = 20;
        chessBoardHeight = 20;
        for (int i = 0; i < chessBoardSize; i++) {
            for (int j = 0; j < chessBoardSize; j++) {
                x1 = i * 20; 
                y1 = j * 20; 
                if ((i % 2 == 0) == (j % 2 == 0)) 
                    g.setColor(Color.BLACK); 
                else
                    g.setColor(Color.WHITE); 
                g.fillRect(x1+numCenter, y1+numCenter, chessBoardWidth, chessBoardHeight); 
            } 
        } 
    }

    /**
     * drawExtraCredit method will draw a parabolic curves image like the drawPart1 but with different orirentation
     * @param width This is the width of the canvas that we will be drawing on
     * @param height This is the height of the canvas that we will be drawing on
     */
    public static void drawExtraCredit(int width, int height)
    {
        DrawingPanel panel = new DrawingPanel(width,height);
        Graphics g = panel.getGraphics();
        int spaces = width/2/LINES;

        Color randomColor1 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor2 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor3 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        Color randomColor4 = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));

        for (int i = 0; i <= LINES; i++) {
            g.setColor(randomColor1);            
            g.drawLine(i*spaces,i*spaces,width/2-i*spaces,height/2+i*spaces); //draw Q1
            g.setColor(randomColor2);
            g.drawLine(width/2-i*spaces,height/2+i*spaces,width-i*spaces,height-i*spaces); //draw Q2
            g.setColor(randomColor3);
            g.drawLine(width-i*spaces,height-i*spaces,width/2+i*spaces,height/2-i*spaces); //draw Q3
            g.setColor(randomColor4);
            g.drawLine(width/2+i*spaces,height/2-i*spaces,i*spaces,i*spaces); //draw Q4
        }
    }
}
