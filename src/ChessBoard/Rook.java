package ChessBoard;

public class Rook extends Piece{
	public Rook(boolean available,int pos1,int pos2){
		super(available,pos1,pos2);
	}
	
	public boolean isValid(Board board, int X1, int Y1, int X2, int Y2) {
        if(super.isValid(board, X1, Y1, X2, Y2) == false)
            return false;
        if(X2 == X1)
            return true;
        if(Y2 == Y1)
            return true;
        return false;
    }
}
