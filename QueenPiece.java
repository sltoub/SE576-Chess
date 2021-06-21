import java.lang.StringBuilder;

public class QueenPiece extends GamePiece {
	
	protected int pieceType;
	protected int pieceColor;
	protected int yIndex;
	protected int xIndex;
	
	protected String moves;
	
	//Constructor for QUEEN pieces
	protected QueenPiece(int colorInput, int xInput, int yInput) {
		
		pieceType = 2;
		
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
		
		//LOOP FOR POS/POS MOVEMENTS
		boolean firstLoopValid = true;
		
		int tempX = xIndex;
		int tempY = yIndex;
		
		try {
			while(firstLoopValid == true) {

				tempX++;
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
		
		//LOOP FOR POS/NEG MOVEMENTS
		boolean secondLoopValid = true;
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			while(secondLoopValid == true) {

				tempX++;
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
		
		//LOOP FOR NEG/NEG MOVEMENTS
		boolean thirdLoopValid = true;
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			while(thirdLoopValid == true) {

				tempX--;
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
		
		//LOOP FOR NEG/POS MOVEMENTS
		boolean fourthLoopValid = true;
		
		tempX = xIndex;
		tempY = yIndex;
		
		try {
			while(fourthLoopValid == true) {

				tempX--;
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
//-------------------------------------------------------------------------------------------------------------------------	
		//LOOP FOR POS-X MOVEMENTS
				boolean fifthLoopValid = true;
				
				tempX = xIndex;
				tempY = yIndex;
				
				try {
					while(fifthLoopValid == true) {

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
							
								fifthLoopValid = false;
							}
						
							else {
						
								fifthLoopValid = false;
							}
						}
					}	
				}catch (ArrayIndexOutOfBoundsException endOfBoard) {
					
					fifthLoopValid = false;
				}
				
				//LOOP FOR NEG-X MOVEMENTS
				boolean sixthLoopValid = true;
				
				tempX = xIndex;
				tempY = yIndex;
				
				try {
					while(sixthLoopValid == true) {

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
							
								sixthLoopValid = false;
							}
						
							else {
						
								sixthLoopValid = false;
							}
						}
					}	
				}catch (ArrayIndexOutOfBoundsException endOfBoard) {
					
					sixthLoopValid = false;
				}
				
				//LOOP FOR POS-Y MOVEMENTS
				boolean seventhLoopValid = true;
				
				tempX = xIndex;
				tempY = yIndex;
				
				try {
					while(seventhLoopValid == true) {

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
							
								seventhLoopValid = false;
							}
						
							else {
						
								seventhLoopValid = false;
							}
						}
					}	
				}catch (ArrayIndexOutOfBoundsException endOfBoard) {
					
					seventhLoopValid = false;
				}
				
				//LOOP FOR NEG-Y MOVEMENTS
				boolean eigthLoopValid = true;
				
				tempX = xIndex;
				tempY = yIndex;
				
				try {
					while(eigthLoopValid == true) {

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
							
								eigthLoopValid = false;
							}
						
							else {
						
								eigthLoopValid = false;
							}
						}
					}	
				}catch (ArrayIndexOutOfBoundsException endOfBoard) {
					
					eigthLoopValid = false;
				}
				
				moves = validMoves.toString();
			}
}

