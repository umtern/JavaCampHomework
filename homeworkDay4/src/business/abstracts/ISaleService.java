package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public interface ISaleService {
	
	void saleW�thCampaign(User user,Game game,Campaign campaign);

	void saleW�thoutCampaign(User user ,Game game);


}