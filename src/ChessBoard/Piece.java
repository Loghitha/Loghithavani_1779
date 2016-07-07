/*
 * /****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Loghithavani

* ***************************************************************************

 */
package ChessBoard;

// TODO: Auto-generated Javadoc
/**
 * The Class Piece.
 */
public class Piece {
    
    /** The available. */
    private boolean available;
    
    /** The x. */
    private int x;
    
    /** The y. */
    private int y;

    /**
     * Instantiates a new piece.
     *
     * @param available the available
     * @param x the x
     * @param y the y
     */
    public Piece(boolean available, int x, int y) {
        super();
        this.available = available;
        this.x = x;
        this.y = y;
    }


    /**
     * Checks if is available.
     *
     * @return true, if is available
     */
    public boolean isAvailable() {
        return available;
    }
    
    /**
     * Sets the available.
     *
     * @param available the new available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    /**
     * Gets the x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Sets the x.
     *
     * @param x the new x
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Gets the y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Sets the y.
     *
     * @param y the new y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Checks if is valid.
     *
     * @param board the board
     * @param X1 the x1
     * @param Y1 the y1
     * @param X2 the x2
     * @param Y2 the y2
     * @return true, if is valid
     */
    public boolean isValid(Board board, int X1, int Y1, int X2, int Y2){
        if(X2 == X1 && Y2 == Y1)
            return false; //cannot move nothing
        if(X2 < 0 || X2 > 7 || X1 < 0 || X1 > 7 || Y2 < 0 || Y2 > 7 || Y1 <0 || Y1 > 7)
            return false;
        return true;
    }

}
