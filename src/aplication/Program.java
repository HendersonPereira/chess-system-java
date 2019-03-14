package aplication;

import java.util.Locale;

import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	
		ChessMatch cm = new ChessMatch();
		UI.printBoard(cm.getPieces());

	}

}
