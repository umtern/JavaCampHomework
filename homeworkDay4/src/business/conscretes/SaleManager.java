package business.conscretes;

import business.abstracts.ISaleService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class SaleManager implements ISaleService {

	@Override
	public void saleWýthCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " isimli kiþi " + game.getGameName() + " isimli oyunu "
				+ campaign.getCampaignName() + " kampanyasý ile satýn almýþtýr ");
	
	System.out.println(" Uygulanan indirim : %  "+game.getDiscount());
	System.out.println(" Eski fiyat  "+game.getPrice()+ " tl " + " -" + " Yeni Fiyat " + game.getPriceAfterDiscount()+" tl ");

	
	}

	@Override
	public void saleWýthoutCampaign(User user, Game game) {
System.out.println(user.getFirstName()+" isimli kullanýcý "+game.getGameName()+" isimli oyunu "+ game.getPrice()+" fiyata satýn almýþtýr.");
	
System.out.println(" Kampanya uygulanmadý.");
	}

}
