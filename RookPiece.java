import java.lang.StringBuilder;

public class RookPiece extends GamePiece {
	
	protected int pieceType;
	protected int pieceColor;
	protected int yIndex;
	protected int xIndex;
	
	protected String moves;
	
	//Constructor for ROOK pieces
	protected RookPiece(int colorInput, int xInput, int yInput) {
		
		pieceType = 3;
		
		pieceColor = colorInput;
		
		yIndex = yInput;
		
		xIndex = xInput;
		
		moves = null;
	}
	
	protected int getColor() {
		
		return pieceColor;
	}
	
	protected int getType() {
		
		return pieceType;
	}
	
	protected String getMoves() {
		
		return moves;
	}
	
	protected int getX() {
		
		return xIndex;
	}
	
	protected int getY() {
		
		return yIndex;
	}
	
	protected void moveSet(GamePiece[][] inputArray) throws ArrayIndexOutOfBoundsException{
		
		StringBuilder validMoves = new StringBuilder();
		
		//LOOP FOR POS-X MOVEMENTS
		boolean firstLoopValid = true;
		
		int tempX = xIndex;
		int tempY = yIndex;
		
		try {
			while(firstLoopValid == true) {

				tempX++;
			
				if(inputArray[tempX][tempY] == null) {
				
					validMoves.append(tempX);
					validMoves.append(tempY);
					validMoves.append(",");
				}
			
				else {
				
					if(inputArray[tempX][tempY].getColor() != pieceColor) {
					
						validMoves.append(tempX);
						validMoves.append(tempY);
						validMoves.append(",");
					
						firstLoopValid = false;
					}
				
					else {
				
						firstLoopValid = false;
					}
				}
			}	
		}catch (ArrayIndexOutOfBoundsException endOfBoard) {
			
			firstLoopValid = false;
		}
		
		//LOOP FOR NEG-X MOVEMENTS
		boolean secondLoopValid = true;
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			while(secondLoopValid == true) {

				tempX--;
			
				if(inputArray[tempX][tempY] == null) {
				
					validMoves.append(tempX);
					validMoves.append(tempY);
					validMoves.append(",");
				}
			
				else {
				
					if(inputArray[tempX][tempY].getColor() != pieceColor) {
					
						validMoves.append(tempX);
						validMoves.append(tempY);
						validMoves.append(",");
					
						secondLoopValid = false;
					}
				
					else {
				
						secondLoopValid = false;
					}
				}
			}	
		}catch (ArrayIndexOutOfBoundsException endOfBoard) {
			
			secondLoopValid = false;
		}
		
		//LOOP FOR POS-Y MOVEMENTS
		boolean thirdLoopValid = true;
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			while(thirdLoopValid == true) {

				tempY++;
			
				if(inputArray[tempX][tempY] == null) {
				
					validMoves.append(tempX);
					validMoves.append(tempY);
					validMoves.append(",");
				}
			
				else {
				
					if(inputArray[tempX][tempY].getColor() != pieceColor) {
					
						validMoves.append(tempX);
						validMoves.append(tempY);
						validMoves.append(",");
					
						thirdLoopValid = false;
					}
				
					else {
				
						thirdLoopValid = false;
					}
				}
			}	
		}catch (ArrayIndexOutOfBoundsException endOfBoard) {
			
			thirdLoopValid = false;
		}
		
		//LOOP FOR NEG-Y MOVEMENTS
		boolean fourthLoopValid = true;
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			while(fourthLoopValid == true) {

				tempY--;
			
				if(inputArray[tempX][tempY] == null) {
				
					validMoves.append(tempX);
					validMoves.append(tempY);
					validMoves.append(",");
				}
			
				else {
				
					if(inputArray[tempX][tempY].getColor() != pieceColor) {
					
						validMoves.append(tempX);
						validMoves.append(tempY);
						validMoves.append(",");
					
						fourthLoopValid = false;
					}
				
					else {
				
						fourthLoopValid = false;
					}
				}
			}	
		}catch (ArrayIndexOutOfBoundsException endOfBoard) {
			
			fourthLoopValid = false;
		}
		
		moves = validMoves.toString();
	}

}
