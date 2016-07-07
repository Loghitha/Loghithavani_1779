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

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player {
    
    /** The pawns. */
    public final int PAWNS = 8;
    
    /** The bishops. */
    public final int BISHOPS = 2;
    
    /** The rooks. */
    public final int ROOKS = 2;
    
    /** The white. */
    public boolean white;

    /** The pieces. */
    private List<Piece> pieces = new ArrayList<>();

    /**
     * Instantiates a new player.
     *
     * @param white the white
     */
    public Player(boolean white) {
        super();
        this.white = white;
    }

    /**
     * Gets the pieces.
     *
     * @return the pieces
     */
    public List<Piece> getPieces() {
        return pieces;
    }


    /**
     * Initialize pieces.
     */
    public void initializePieces(){
        if(this.white == true){
            for(int i=0; i<PAWNS; i++){ 
                pieces.add(new Pawn(true,i,2));
            }
            pieces.add(new Rook(true, 0, 0));
            pieces.add(new Rook(true, 7, 0));
            pieces.add(new Bishop(true, 2, 0));
            pieces.add(new Bishop(true, 5, 0));
            pieces.add(new Knight(true, 1, 0));
            pieces.add(new Knight(true, 6, 0));
            pieces.add(new Queen(true, 3, 0));
            pieces.add(new King(true, 4, 0));
        }
        else{
            for(int i=0; i<PAWNS; i++){ 
                pieces.add(new Pawn(true,i,6));
            }
            pieces.add(new Rook(true, 0, 7));
            pieces.add(new Rook(true, 7, 7));
            pieces.add(new Bishop(true, 2, 7));
            pieces.add(new Bishop(true, 5, 7));
            pieces.add(new Knight(true, 1, 7));
            pieces.add(new Knight(true, 6, 7));
            pieces.add(new Queen(true, 3, 7));
            pieces.add(new King(true, 4, 7));
        }

    }
}
