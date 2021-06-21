import java.lang.StringBuilder;

public class PawnPiece extends GamePiece {
	
	protected int pieceType;
	protected int pieceColor;
	protected int yIndex;
	protected int xIndex;
	
	protected String moves;
	
	//constructor for PAWN piece
	public PawnPiece(int colorInput, int xInput, int yInput) {
		
		pieceType = 6;
		
		pieceColor = colorInput;
		
		xIndex = xInput;
		
		yIndex = yInput;
		
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
		
		//move set for white pieces
		if(pieceColor == 1) {
			
			//initial move set (potential two space move)
			if(yIndex == 1) {
				
			try {
				if(inputArray[xIndex][(yIndex + 1)] == null) {
					
					validMoves.append(xIndex);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			
			try {
				if(inputArray[xIndex][(yIndex + 2)] == null) {
					
					validMoves.append(xIndex);
					validMoves.append((yIndex + 2));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			
			try {
				if(inputArray[(xIndex + 1)][(yIndex + 1)] != null && inputArray[(xIndex + 1)][(yIndex + 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex + 1);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			
			try {
				if(inputArray[(xIndex - 1)][(yIndex + 1)] != null && inputArray[(xIndex - 1)][(yIndex + 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex - 1);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}

			}
				
			
			//normal move set
			else {
				
			try {
				if(inputArray[xIndex][(yIndex + 1)] == null) {
					
					validMoves.append(xIndex);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}

			try {
				if(inputArray[(xIndex + 1)][(yIndex + 1)] != null && inputArray[(xIndex + 1)][(yIndex + 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex + 1);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
				
			try {
				if(inputArray[(xIndex - 1)][(yIndex + 1)] != null && inputArray[(xIndex - 1)][(yIndex + 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex - 1);
					validMoves.append((yIndex + 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			}
		}
		
		//move set for black pieces
		else {
			
			//initial move set (potential two space move)
			if(yIndex == 6) {
				
			try {
				if(inputArray[xIndex][(yIndex - 1)] == null) {
					
					validMoves.append(xIndex);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			
			try {
				if(inputArray[xIndex][(yIndex - 2)] == null) {
					
					validMoves.append(xIndex);
					validMoves.append((yIndex - 2));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			
			try {
				if(inputArray[(xIndex + 1)][(yIndex - 1)] != null && inputArray[(xIndex + 1)][(yIndex - 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex + 1);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			
			try {
				if(inputArray[(xIndex - 1)][(yIndex - 1)] != null && inputArray[(xIndex - 1)][(yIndex - 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex -1);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}

			}
				
			
			//normal move set
			else {
				
			try {
				if(inputArray[xIndex][(yIndex - 1)] == null) {
					
					validMoves.append(xIndex);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}

			try {
				if(inputArray[(xIndex + 1)][(yIndex - 1)] != null && inputArray[(xIndex + 1)][(yIndex - 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex + 1);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
				
			try {
				if(inputArray[(xIndex - 1)][(yIndex - 1)] != null && inputArray[(xIndex - 1)][(yIndex - 1)].getColor() != pieceColor) {
					
					validMoves.append(xIndex - 1);
					validMoves.append((yIndex - 1));
					validMoves.append(",");
				}
				
			}catch(ArrayIndexOutOfBoundsException endOfBoard) {
				
				//move is out of bounds and need not be appended
			}
			}
		}
		
		moves = validMoves.toString();
	}
}
