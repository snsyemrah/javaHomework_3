package javaCampDay4Homework3;

import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{

	@Override
	
	public void add(Game game) {
		System.out.println("New game was added : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("New game was deleted : " + game.getGameName());
		
	}

	@Override
	public void uptade(Game game) {
		System.out.println("New game was updated : " + game.getGameName());
		
	}
	

}
