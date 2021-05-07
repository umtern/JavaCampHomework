package business.abstracts;

import entities.concretes.Campaign;

public interface ICampaignService {
	
	void add (Campaign campaign);
	
	void delete (Campaign campaign);
	
	void update (Campaign campaign);
	

}
