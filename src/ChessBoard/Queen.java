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

public class Queen extends Piece {
	
	/**
	 * Instantiates a new queen.
	 *
	 * @param available the available
	 * @param x the x
	 * @param y the y
	 */
	public Queen(boolean available,int pos1,int pos2){
		super(available,pos1,pos2);
	}
	
	public boolean isValid(Board board, int X1, int Y1, int X2, int Y2) {
        if(super.isValid(board, X1, Y1, X2, Y2) == false)
            return false;
        //diagonal
        if(X2 - X1 == Y2 - Y1)
            return true;
        if(X2 == X1)
            return true;
        if(Y2 == Y1)
            return true;

        return false;
    }
}
