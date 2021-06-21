//Steven Toub
//SE576-900
//Semester Project: Chess

import java.util.Scanner;
import java.util.ArrayList;

//Main Class
public class Chess {

	public static void main(String[] args) throws StringIndexOutOfBoundsException{
		
		Scanner scan = new Scanner(System.in);
		
		//user input for each color
		String blackPieces = "";
		
		String whitePieces = "";
		
		System.out.println("Input your game board configuration below: ");
		
		//input validation loop for white pieces
		boolean inputIsValid = false;
		
		while(inputIsValid == false) {
			
			System.out.print("WHITE: ");
			
					String whitePiecesInput = scan.nextLine();
					
					inputIsValid = verifyUserInput(whitePiecesInput);
			
					if(inputIsValid == false) {
						
						System.out.println("");
						System.out.println("That input was not valid. Must be (K/Q/R/B/N/P|a-h|1-8)");
					}
					
					else {
						
						whitePieces = whitePiecesInput;
					}
		}
		
			inputIsValid = false;
		
		//input validation loop for black pieces
		while(inputIsValid == false) {
				
			System.out.print("BLACK: ");
			
					String blackPiecesInput = scan.nextLine();
					
					inputIsValid = verifyUserInput(blackPiecesInput);
					
					if(inputIsValid == false) {
						
						System.out.println("");
						System.out.println("That input was not valid. Must be (K/Q/R/B/N/P|a-h|1-8)");
					}
					
					else {
						
						blackPieces = blackPiecesInput;
					}
		}

		
		System.out.println("");

		System.out.print("Enter the piece you'd like to know legal moves for: ");
			
		//Creates the game board with input
			GameBoard board = new GameBoard(whitePieces, blackPieces);
			
			String pieceSelect = scan.nextLine();
		
			Constants conversions = new Constants();
			
			try {
				
			//separates selected piece into chars so they can be converted to usable array values
			char[] chars = pieceSelect.toCharArray();
		
				int x = conversions.letterToCoordinate(chars[1]);
		
				int y = ((Character.getNumericValue(chars[2])) - 1);
				
				board.boardArray[x][y].moveSet(board.boardArray);
				
				//collects the viable moves from the selected object and stores them in a string array
				String[] initialMoveArray = board.boardArray[x][y].getMoves().split(",");
				
				ArrayList<String> finalMoveArray = new ArrayList<String>();
				
				int targetX = board.boardArray[x][y].getX();
				int targetY = board.boardArray[x][y].getY();
				int targetCol = board.boardArray[x][y].getColor();
				int targetType = board.boardArray[x][y].getType();

				//FILTERS OUT MOVES THAT RESULT IN CHECK
				try {
					
					//iterates over the viable moves
					for(int i = 0; i < initialMoveArray.length; i++) {
					
						int importableX = (initialMoveArray[i].charAt(0) - '0');
						int importableY = (initialMoveArray[i].charAt(1) - '0');
						Boolean isValidMove = checkChecker(importableX, importableY, blackPieces, whitePieces, targetX, targetY, targetCol, targetType);
						
						//only appends non check moves to final move list
						if(isValidMove == true) {
						
							char convertedX = conversions.coordinateToLetter(initialMoveArray[i].charAt(0));
							int convertedY = ((Character.getNumericValue(initialMoveArray[i].charAt(1))) + 1);
							String acceptedMove = (convertedX + "" + convertedY);
						
							finalMoveArray.add(acceptedMove);
						}
					}
				}catch(StringIndexOutOfBoundsException s) {
					
					//move array is empty, there are no valid moves for this piece
					finalMoveArray.add("This piece has no viable moves.");
				}
				
				System.out.print(finalMoveArray);
				
				
			}catch(NullPointerException n) {
				
				System.out.print("You have not selected a valid piece on the board.");
			}
				scan.close();
	} 
	
	//This method is used to filter out moves that will result in friendly check
	public static Boolean checkChecker(int xInt, int yInt, String black, String white, int tarX, int tarY, int tarCol, int tarType) throws StringIndexOutOfBoundsException{
			
		//stages board with adjusted piece move from move set
			Constants con = new Constants();
			GameBoard simulation = new GameBoard(white, black);
			
			simulation.boardArray[xInt][yInt] = con.pieceFactory(tarType, tarCol, tarX, tarY);
			simulation.boardArray[tarX][tarY] = null;
		
			Boolean valid = true;
			
			//traverses every board space and simulates moves
			for(int a = 0; a < simulation.boardArray.length; a++) {
				
				for(int b = 0; b < simulation.boardArray[a].length; b++) {
					
					//selects game piece objects that are on the opposing team and simulates their moves
					if(simulation.boardArray[a][b] != null && simulation.boardArray[a][b].getColor() != tarCol) {
						
						simulation.boardArray[a][b].moveSet(simulation.boardArray);
						
						String[] simulatedMoves = simulation.boardArray[a][b].getMoves().split(",");
						
						//traverses current enemy object's viable moves and determines if the board config threatens a friendly king
						try {	
							
							for(int c = 0; c < simulatedMoves.length; c++) {
							
								int tempX = simulatedMoves[c].charAt(0) - '0';
								int tempY = simulatedMoves[c].charAt(1) - '0';
							
								if(simulation.boardArray[tempX][tempY] != null && simulation.boardArray[tempX][tempY].getType() == 1) {
								
									valid = false;
								}
							}
							
						}catch(StringIndexOutOfBoundsException s) {
							
							//move array is empty, no valid moves for this piece
						}

					}           
					
				}
				
			}
			
			return valid;
	}
	
	//input validation method, takes a string as a parameter for processing
	public static Boolean verifyUserInput(String userInput) throws ArrayIndexOutOfBoundsException{
		
		String[] userInputArray = userInput.split(",");
		
		boolean inputValidity = false;
		
		try {
		
		//traverses the passed string parameter
		for(int d = 0; d < userInputArray.length; d++) {
			
			char[] inputChars = userInputArray[d].toCharArray();
			
				if(inputChars[0] == 'K' || inputChars[0] == 'Q' || inputChars[0] == 'R' || inputChars[0] == 'B' || inputChars[0] == 'N' || inputChars[0] == 'P') {
					
					if(inputChars[1] == 'a' || inputChars[1] == 'b' || inputChars[1] == 'c' || inputChars[1] == 'd' || inputChars[1] == 'e' || inputChars[1] == 'f' || 
						inputChars[1] == 'g' || inputChars[1] == 'h') {
						
						if(inputChars[2] == '1' || inputChars[2] == '2' || inputChars[2] == '3' || inputChars[2] == '4' || inputChars[2] == '5' || inputChars[2] == '6' ||
								inputChars[2] == '7' || inputChars[2] == '8') {
							
							//input is only valid if all three if statements are true
							inputValidity = true;
							
						}
						
						else {
							
							inputValidity = false;
						}
					}
					
					else {
						
						inputValidity = false;
					}
				}
				
				else {
					
					inputValidity = false;
				}
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("You cannot have a board where one side has no pieces.");
		}
		
		return inputValidity;
	}

}
