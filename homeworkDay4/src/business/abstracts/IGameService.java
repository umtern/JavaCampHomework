package business.abstracts;

import entities.concretes.Game;

public interface IGameService {
	
	void add(Game game);
	
	void delete(Game game);
	
	void update(Game game);
	

}
