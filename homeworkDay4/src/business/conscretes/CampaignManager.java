package business.conscretes;

import business.abstracts.ICampaignService;
import entities.concretes.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
System.out.println("Kampanya eklendi : " + campaign.getCampaignName());		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());		
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi : " + campaign.getCampaignName());		
		
	}
	
	

}
