package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;


public class Main {
	public static void main(String[] args){		
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();					
		values = game.collectInputData();		
		game.run(values);
	}
}
