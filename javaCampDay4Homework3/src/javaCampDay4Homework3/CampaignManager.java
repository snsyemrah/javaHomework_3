package javaCampDay4Homework3;

import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("New campaign was added : " + campaign.getCampaingName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign was deleted : " + campaign.getCampaingName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign was updated : " + campaign.getCampaingName());
		
	}

}
