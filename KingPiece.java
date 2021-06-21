import java.lang.StringBuilder;

public class KingPiece extends GamePiece {
	
	protected int pieceType;
	protected int pieceColor;
	protected int yIndex;
	protected int xIndex;
	
	protected String moves;
	
	//Constructor for KING pieces
	protected KingPiece(int colorInput, int xInput, int yInput) {
		
		pieceType = 1;
		
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
		
		//POS-Y movement
		try {
			if(inputArray[xIndex][(yIndex + 1)] == null) {
				
				validMoves.append(xIndex);
				validMoves.append((yIndex + 1));
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[xIndex][(yIndex + 1)].getColor() != pieceColor) {
				
					validMoves.append(xIndex);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//NEG-Y movement
		try {
			if(inputArray[xIndex][(yIndex - 1)] == null) {
				
				validMoves.append(xIndex);
				validMoves.append((yIndex - 1));
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[xIndex][(yIndex - 1)].getColor() != pieceColor) {
				
					validMoves.append(xIndex);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//POS-X movement
		try {
			if(inputArray[(xIndex + 1)][yIndex] == null) {
				
				validMoves.append((xIndex + 1));
				validMoves.append(yIndex);
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[(xIndex + 1)][yIndex].getColor() != pieceColor) {
				
					validMoves.append((xIndex + 1));
					validMoves.append(yIndex);
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//NEG-X movement
		try {
			if(inputArray[(xIndex - 1)][yIndex] == null) {
				
				validMoves.append((xIndex - 1));
				validMoves.append(yIndex);
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[(xIndex - 1)][yIndex].getColor() != pieceColor) {
				
					validMoves.append((xIndex - 1));
					validMoves.append(yIndex);
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//POS/POS movement
		try {
			if(inputArray[(xIndex + 1)][(yIndex + 1)] == null) {
				
				validMoves.append((xIndex + 1));
				validMoves.append((yIndex + 1));
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[(xIndex + 1)][(yIndex + 1)].getColor() != pieceColor) {
				
					validMoves.append((xIndex + 1));
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//POS/NEG movement
		try {
			if(inputArray[(xIndex + 1)][(yIndex - 1)] == null) {
				
				validMoves.append((xIndex + 1));
				validMoves.append((yIndex - 1));
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[(xIndex + 1)][(yIndex - 1)].getColor() != pieceColor) {
				
					validMoves.append((xIndex + 1));
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//NEG/NEG movement
		try {
			
			if(inputArray[(xIndex - 1)][(yIndex - 1)] == null) {
				
				validMoves.append((xIndex - 1));
				validMoves.append((yIndex - 1));
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[(xIndex - 1)][(yIndex - 1)].getColor() != pieceColor) {
				
					validMoves.append((xIndex - 1));
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		//NEG/POS movement
		try {
			
			if(inputArray[(xIndex - 1)][(yIndex + 1)] == null) {
				
				validMoves.append((xIndex - 1));
				validMoves.append((yIndex + 1));
				validMoves.append(",");
			}
			
			else {
				
				if(inputArray[(xIndex - 1)][(yIndex + 1)].getColor() != pieceColor) {
				
					validMoves.append((xIndex - 1));
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException endOfBoard) {
			
			//move is out of bounds and need not be appended
		}
		
		moves = validMoves.toString();
	}
}