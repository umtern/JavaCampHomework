package entities.concretes;

import entities.abstracts.IEntity;

public class Campaign implements IEntity{
	
	private String campaignName;
	
	
	public Campaign() {
		
	}

	public Campaign(String campaignName) {
		super();
		this.campaignName = campaignName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	

}
