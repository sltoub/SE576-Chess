
public class GameBoard {

	GamePiece[][] boardArray = new GamePiece[8][8];
	
	//constructor for a game board
	public GameBoard(String whiteInput, String blackInput) {
			
		parseInput(whiteInput, 1, boardArray);
		
		parseInput(blackInput, 2, boardArray);
	}
	
	//method for converting user input strings into game piece objects and placing them on the board
	private void parseInput(String inputString, int colorInput, GamePiece[][] inputBoard) {
		
		String[] inputArray = inputString.split(",");
		
		//traverses each game piece input and creates a gamepiece at the desired coordinates
		for(int i = 0; i < inputArray.length; i++) {
			
			char[] charArray = inputArray[i].toCharArray();
			
			Constants convert = new Constants();
			
			int type = convert.typeOfPiece(charArray[0]);
			
			int x = convert.letterToCoordinate(charArray[1]);
			
			int y = ((Character.getNumericValue(charArray[2])) - 1);
				
			int color = colorInput;
			
			inputBoard[x][y] = convert.pieceFactory(type, color, x, y);
		}
	}

}
