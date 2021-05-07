package business.conscretes;

import business.abstracts.ISaleService;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class SaleManager implements ISaleService {

	@Override
	public void saleW�thCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " isimli ki�i " + game.getGameName() + " isimli oyunu "
				+ campaign.getCampaignName() + " kampanyas� ile sat�n alm��t�r ");
	
	System.out.println(" Uygulanan indirim : %  "+game.getDiscount());
	System.out.println(" Eski fiyat  "+game.getPrice()+ " tl " + " -" + " Yeni Fiyat " + game.getPriceAfterDiscount()+" tl ");

	
	}

	@Override
	public void saleW�thoutCampaign(User user, Game game) {
System.out.println(user.getFirstName()+" isimli kullan�c� "+game.getGameName()+" isimli oyunu "+ game.getPrice()+" fiyata sat�n alm��t�r.");
	
System.out.println(" Kampanya uygulanmad�.");
	}

}
