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
 * The Class King.
 */
public class King extends Piece{
	
	/**
	 * Instantiates a new king.
	 *
	 * @param available the available
	 * @param x the x
	 * @param y the y
	 */
	public King(boolean available,int pos1,int pos2){
		super(available,pos1,pos2);
	}
	
	public boolean isValid(Board board, int X1, int Y1, int X2, int Y2) {
        if(super.isValid(board, X1, Y1, X2, Y2) == false)
            return false;
        if(Math.sqrt(Math.pow(Math.abs((X2 - X1)),2)) + Math.pow(Math.abs((Y2 - Y1)), 2) != Math.sqrt(2)){
            return false;
        }
        return false;
    }
}
