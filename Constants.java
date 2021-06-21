//this class holds frequently called conversions and the piece factory
public final class Constants {
	
	//converts a user input piece identifier into its numerical class counterpart
	public int typeOfPiece(char inputChar) {
		
		int pieceNum;
		
		if(inputChar == 'K' || inputChar == 'k') {
			
			pieceNum = 1;
			return pieceNum;
		}
		
		else if(inputChar == 'Q' || inputChar == 'q') {
			
			pieceNum = 2;
			return pieceNum;
		}
		
		else if(inputChar == 'R' || inputChar == 'r') {
			
			pieceNum = 3;
			return pieceNum;
		}
		
		else if(inputChar == 'B' || inputChar == 'b') {
			
			pieceNum = 4;
			return pieceNum;
		}
		
		else if(inputChar == 'N' || inputChar == 'n') {
			
			pieceNum = 5;
			return pieceNum;
		}
		
		else if(inputChar == 'P' || inputChar == 'p') {
			
			pieceNum = 6;
			return pieceNum;
		}
		
		//default case
		else {
			
			return 0;
		}
	}
	
	//converts a game board letter coordinate to an array value
	public int letterToCoordinate(char inputChar) {
		
		int arrayNum;
		
		if(inputChar == 'a' || inputChar == 'A') {
			
			arrayNum = 0;
			return arrayNum;
		}
		
		else if(inputChar == 'b' || inputChar == 'B') {
			
			arrayNum = 1;
			return arrayNum;
		}
		
		else if (inputChar == 'c' || inputChar == 'C') {
			
			arrayNum = 2;
			return arrayNum;
		}
		
		else if (inputChar == 'd' || inputChar == 'D') {
			
			arrayNum = 3;
			return arrayNum;
		}
		
		else if (inputChar == 'e' || inputChar == 'E') {
			
			arrayNum = 4;
			return arrayNum;
		}
		
		else if (inputChar == 'f' || inputChar == 'F') {
			
			arrayNum = 5;
			return arrayNum;
		}
		
		else if (inputChar == 'g' || inputChar == 'G') {
			
			arrayNum = 6;
			return arrayNum;
		}
		
		else if (inputChar == 'h' || inputChar == 'H') {
			
			arrayNum = 7;
			return arrayNum;
		}
		
		//default case/incompatible input
		else {
			
			return 8;
		}
	}
	
	//converts an array value back to a game board letter coordinate
	public char coordinateToLetter(char inputChar) {
		
		char letter;
		
		if(inputChar == '0') {
			
			letter = 'a';
			return letter;
		}
		
		else if(inputChar == '1') {
			
			letter = 'b';
			return letter;
		}
		
		else if (inputChar == '2') {
			
			letter = 'c';
			return letter;
		}
		
		else if (inputChar == '3') {
			
			letter = 'd';
			return letter;
		}
		
		else if (inputChar == '4') {
			
			letter = 'e';
			return letter;
		}
		
		else if (inputChar == '5') {
			
			letter = 'f';
			return letter;
		}
		
		else if (inputChar == '6') {
			
			letter = 'g';
			return letter;
		}
		
		else if (inputChar == '7') {
			
			letter = 'h';
			return letter;
		}
		
		//default case/incompatible input
		else {
			
			return 'z';
		}
	}
	
	//Determines which game piece type to create and creates it
	public GamePiece pieceFactory(int inputType, int inputColor, int inputX, int inputY) {
		
		if (inputType == 1) {
			
			KingPiece piece = new KingPiece(inputColor, inputX, inputY);
			return piece;
		}
		
		else if(inputType == 2) {
			
			QueenPiece piece = new QueenPiece(inputColor, inputX, inputY);
			return piece;
		}
		
		else if(inputType == 3) {
			
			RookPiece piece = new RookPiece(inputColor, inputX, inputY);
			return piece;
		}
		
		else if(inputType == 4) {
			
			BishopPiece piece = new BishopPiece(inputColor, inputX, inputY);
			return piece;
		}
		
		else if(inputType == 5) {
			
			KnightPiece piece = new KnightPiece(inputColor, inputX, inputY);
			return piece;
		}
		
		else if(inputType == 6) {
			
			PawnPiece piece = new PawnPiece(inputColor, inputX, inputY);
			return piece;
		}
		
		//failure case
		else {
			
			PawnPiece piece = new PawnPiece(0,9,9);
			return piece;
		}
	}
}
