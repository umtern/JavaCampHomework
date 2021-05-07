import java.rmi.RemoteException;

import business.conscretes.CampaignManager;
import business.conscretes.GameManager;
import business.conscretes.SaleManager;
import business.conscretes.UserManager;
import core.MersisManagerAdapter;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		
		 
		User user1 = new User("Ümit","Eren",1997,29252299000L);
		UserManager userManager = new UserManager(new MersisManagerAdapter());
		

		userManager.add(user1);
		userManager.delete(user1);
		userManager.update(user1);
		
		System.out.println("-----------------------------------------------------------------");
		
		Campaign campaign1 = new Campaign("Öðrenci Kampanyasý");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		System.out.println("---------------------------------------------------------------");
		
		
		Game game1 = new Game("Far cry 5 ",250,75);
		Game game2 = new Game("Crysis 3",185);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game2);
		
		System.out.println("--------------------------------------------------------");
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.saleWýthCampaign(user1, game1, campaign1);
		saleManager.saleWýthoutCampaign(user1, game2);
		
		
		
		
		
	}

}
