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

public class Knight extends Piece {
	
	/**
	 * Instantiates a new knight.
	 *
	 * @param available the available
	 * @param x the x
	 * @param y the y
	 */
	public Knight(boolean available, int pos1, int pos2){
		super(available, pos1, pos2);
	}
	
	public boolean isValid(Board board, int X1, int Y1, int X2, int Y2) {
        if(super.isValid(board, X1, Y1, X2, Y2) == false)
            return false;

        if(X2 != X1 - 1 && X2 != X1 + 1 && X2 != X1 + 2 && X2 != X1 - 2)
            return false;
        if(Y2 != Y1 - 2 && Y2 != Y1 + 2 && Y2 != Y1 - 1 && Y2 != Y1 + 1)
            return false;

        return true;
    }
}
