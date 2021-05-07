package business.conscretes;

import business.abstracts.IGameService;
import entities.concretes.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
System.out.println("Oyun eklendi : "+ game.getGameName());		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: "+ game.getGameName());		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : "+ game.getGameName());		
		
	}

}
