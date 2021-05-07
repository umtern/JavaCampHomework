package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public interface ISaleService {
	
	void saleWýthCampaign(User user,Game game,Campaign campaign);

	void saleWýthoutCampaign(User user ,Game game);


}