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
 * The Class Game.
 */
public class Game {
    
    /** The board. */
    private Board board = new Board();
    
    /** The white. */
    private Player white;
    
    /** The black. */
    private Player black;
    
    /**
     * Instantiates a new game.
     */
    public Game() {
        super();
    }

    /**
     * Sets the color white.
     *
     * @param player the new color white
     */
    public void setColorWhite(Player player) {
        this.white = player;
    }

    /**
     * Sets the color black.
     *
     * @param player the new color black
     */
    public void setColorBlack(Player player) {
        this.black = player;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Sets the board.
     *
     * @param board the new board
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Gets the white.
     *
     * @return the white
     */
    public Player getWhite() {
        return white;
    }

    /**
     * Sets the white.
     *
     * @param white the new white
     */
    public void setWhite(Player white) {
        this.white = white;
    }

    /**
     * Gets the black.
     *
     * @return the black
     */
    public Player getBlack() {
        return black;
    }

    /**
     * Sets the black.
     *
     * @param black the new black
     */
    public void setBlack(Player black) {
        this.black = black;
    }

    /**
     * Initialize board given players.
     *
     * @return true, if successful
     */
    public boolean initializeBoardGivenPlayers() {
        if(this.black == null || this.white == null)
            return false;
        this.board = new Board();
        for(int i=0; i<black.getPieces().size(); i++){
            board.getSpot(black.getPieces().get(i).getX(), black.getPieces().get(i).getY()).occupySpot(black.getPieces().get(i));
        }
        return true;
    }
}