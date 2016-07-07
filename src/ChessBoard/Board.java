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
 * The Class Board.
 */
public class Board {
    
    /** The spots. */
    private Spot[][] spots = new Spot[8][8];

    /**
     * Instantiates a new board.
     */
    public Board() {
        super();
        for(int i=0; i<spots.length; i++){
            for(int j=0; j<spots.length; j++){
                this.spots[i][j] = new Spot(i, j);
            }
        }
    }

    /**
     * Gets the spot.
     *
     * @param x the x
     * @param y the y
     * @return the spot
     */
    public Spot getSpot(int x, int y) {
        return spots[x][y];
    }

}