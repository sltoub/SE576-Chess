//Steven Toub
//SE576-900
//Semester Project: Chess

//the abstract super class for game pieces
public abstract class GamePiece {
		
	protected abstract void moveSet(GamePiece inputArray[][]);
	
	protected abstract int getType();
	
	protected abstract int getColor();
	
	protected abstract int getX();
	
	protected abstract int getY();
	
	protected abstract String getMoves();
}
