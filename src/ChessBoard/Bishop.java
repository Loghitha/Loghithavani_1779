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
 * The Class Bishop.
 */
public class Bishop extends Piece{

    /**
     * Instantiates a new bishop.
     *
     * @param available the available
     * @param pos1 the pos 1
     * @param pos2 the pos 2
     */
    public Bishop(boolean available, int pos1, int pos2) {
        super(available, pos1, pos2);
    }

    public boolean isValid(Board board, int X1, int Y1, int X2, int Y2) {
        if(super.isValid(board, X1, Y1, X2, Y2) == false)
            return false;

        if(X2 - X1 == Y2 - Y1)
            return true;

        return false;
    }

}