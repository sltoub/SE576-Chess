import java.lang.StringBuilder;

public class KnightPiece extends GamePiece {
	
	protected int pieceType;
	protected int pieceColor;
	protected int yIndex;
	protected int xIndex;
	
	protected String moves;
	
	//constructor for KNIGHT piece
	public KnightPiece(int colorInput, int xInput, int yInput) {
		
		pieceType = 5;
		
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
		
		int tempX = xIndex;
		int tempY = yIndex;
		//+2+1
		try {
			
			tempX = tempX + 2;
			tempY = tempY + 1;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//-2+1
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX - 2;
			tempY = tempY + 1;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//-2-1
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX - 2;
			tempY = tempY - 1;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//+2-1
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX + 2;
			tempY = tempY - 1;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//+1-2
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX + 1;
			tempY = tempY - 2;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//+1+2
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX + 1;
			tempY = tempY + 2;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//-1+2
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX - 1;
			tempY = tempY + 2;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
		//-1-2
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			
			tempX = tempX - 1;
			tempY = tempY - 2;
			
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
				
					}
				
			}
			
		} catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds, coordinates need not be appended to move set
		}
		
			
			moves = validMoves.toString();
	}

}
	
