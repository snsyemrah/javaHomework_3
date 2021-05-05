package javaCampDay4Homework3;

import java.util.Date;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		Gamer gamer1 = new Gamer(1, "Emrah", "Þensoy", "39494021563", new Date(1998,5,8));
		GameManager gameManager = new GameManager();
		Game game1 = new Game (1 , "PubG",150);
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1 , "Bahar Firsati", 10);
		SaleManager saleManager = new SaleManager();
		gamerManager.add(gamer1);
		campaignManager.add(campaign1);
		saleManager.sale(gamer1, game1);
		saleManager.saleWithCampaign(gamer1, game1, campaign1);
			
		
	}

}
