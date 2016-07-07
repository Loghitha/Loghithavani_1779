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
 * The Class Spot.
 */
public class Spot {
    
    /** The x. */
    int x;
    
    /** The y. */
    int y;
    
    /** The piece. */
    Piece piece;

    /**
     * Instantiates a new spot.
     *
     * @param x the x
     * @param y the y
     */
    public Spot(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    /**
     * Occupy spot.
     *
     * @param piece the piece
     */
    public void occupySpot(Piece piece){
        if(this.piece != null)
            this.piece.setAvailable(false);
        this.piece = piece;
    }

    /**
     * Checks if is occupied.
     *
     * @return true, if is occupied
     */
    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    /**
     * Release spot.
     *
     * @return the piece
     */
    public Piece releaseSpot() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

}