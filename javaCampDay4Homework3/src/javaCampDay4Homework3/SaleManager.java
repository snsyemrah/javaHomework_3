package javaCampDay4Homework3;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " named gamer bought " + game.getGameName() );
		
	}

	@Override
	public void saleWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " named gamer bought " + game.getGameName() + " with discountRate %" + campaign.getDiscountRate());
		
	}

}
